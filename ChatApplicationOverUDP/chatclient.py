import socket
import threading
import pickle
import getopt
import sys
import re
import time

identifier=0
global sip_address,port

#validates the ip provided as command line arguements by user.
# returns true if IP address provided by user is an valid IP address
def validate_ip(value):
    match = re.match(r'^(\d|[1-9]\d|1\d\d|2([0-4]\d|5[0-5]))\.(\d|[1-9]\d|1\d\d|2([0-4]\d|5[0-5]))\.(\d|[1-9]\d|1\d\d|2([0-4]\d|5[0-5]))\.(\d|[1-9]\d|1\d\d|2([0-4]\d|5[0-5]))$',value, re.I)
    if match:
        return True
    else:
	return False
    
## Here we parse the cammand line arguments provided by user and getopt() is module which parses command-line arguments as option and value pair

try:
    arguments_list, remainder = getopt.gnu_getopt(sys.argv[1:], 'i:p:',['sip=','sp=',]) # arguments_list contains all the arguements from 1 to 5
    ## Check if arguements be no less or more than 5 for client else exits
    if len(sys.argv)==5: 
        for option,value in arguments_list:
            if option in ('-i','--sip') and value is not None:
		if validate_ip(value):
		    sip_address = value
		else:
		    print 'Command: options --sip [IP_ADDRESS], --sp [PORT]'
		    sys.exit()
            if option in ('-p','--sp') and value is not None:
                
		if int(value) >0 and int(value)<65536:
		    port = int(value)
		else:
		    print 'Command: options --sip [IP_ADDRESS], --sp [PORT]'
		    sys.exit()
            
    else: 	# stops execution if command line doesnt have 5 arguements
        print 'Command: options --sip [IP_ADDRESS], --sp [PORT]'
        sys.exit()
# if user types the command this except catches it
except getopt.GetoptError as errormessage: 
    print errormessage
    print 'Usage: Command: options --sip [IP_ADDRESS], --sp [PORT]'
    sys.exit()

# This stores the server IP and PORT
server_address = (sip_address,int(port))


# This function check if the incoming message is identifier or an incoming broadcast message from server
# "pickle" is module in python which marshals and unmarshalls data so that we can conviniently send data structurs over socket or network
def recieve_data(socket):
    while True:
        global identifier
        marshalled_message,server_addr = socket.recvfrom(1024)
	unmarshalled_message = pickle.loads(marshalled_message) # This function unmarshalls the message in my case it is tuple.
	keyword = unmarshalled_message[0] 			# Keyword can be Incoming or Identifier
	message = unmarshalled_message[1] 			# it is braodcast message from server sent by any connected user
        if keyword.startswith('Identifier'):
            identifier = message 				# sets identifier 
        elif keyword.startswith('Incoming'):
            print message  					# prints message sent from server only
	else:	
	    pass						# if client recieves any other packet without key word Incoming or Identifier then it does nothing

# This function is invoked when client tries to greet the server and register into the broadcast group
def greet_server(message):
    global clientsocket
    unmarshalled_greeting = ('Greeting',message,str(identifier))
    marshalled_greeting = pickle.dumps(unmarshalled_greeting) 	# This part marshalls the data for network and is unmarshalled on server
    return clientsocket.sendto(marshalled_greeting,server_address)

# This funtion is invoked when the client has greeted server and starts sending messages
def message_server(message):
    global clientsocket
    unmarshalled_message = ('Message',message,str(identifier)) # This code marshalles the message and sends on network and unmarshalled on server
    marshalled_message = pickle.dumps(unmarshalled_message)
    return clientsocket.sendto(marshalled_message,server_address)

# this part of code creats thread for recieving data so that we can send and recieve from the socket simultaneously
def connect():
    global clientsocket
    clientsocket = socket.socket(socket.AF_INET,socket.SOCK_DGRAM) # Creates a UDP socket
    message = raw_input('Greet the Server: ')
    #it checks for message to be no longer than 1000 else notify user
    while len(message) < 1000 and message != 'Greeting':
        message = raw_input('Greet the Server: ')

    greet_server(message)
    
    try:
	# Here we create thread for recieving data
        t = threading.Thread( target=recieve_data, args=(clientsocket, ))
        t.start()
    except:
        print "Error: unable to start thread"

    count=2
    # This part of code checks if server is up and running when client send greeting to server
    # if server is not online it breaks after 15 seconds
    # Only if server is online, identifier is updated else identifier will be zero. so if identifier is not updated then server is not responding or down 
    while identifier == 0:
        if identifier == 0 and count>0:
            time.sleep(2)
	    count = count-1
        else:
	    print "Couldn't connect to server please make sure server is up and running."
            sys.exit()
    print 'start typing message'
    #This creates an infinites loop so that sender can send unlimited number of messages
    while True:
        message = raw_input('')
        if len(message)<1000:
            message_server(message)
	else:
	    print 'message is too large' 

# This is main() where the program starts executing and calls connect 
def main():
    connect()
main()


