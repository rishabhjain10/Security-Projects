import socket
import random
import datetime
import pickle
import sys
import getopt

activeusers = {}

# getopt() is used to parse command-line arguments provided user
try:
    values, remainder = getopt.gnu_getopt(sys.argv[1:], 'p:',['sp=',])
    if len(sys.argv)==3:
        for opt,value in values:
            if opt in ('-p','--sp') and value is not None:
		if int(value)>0 and int(value)<65536:
		    port = int(value)
		else:
		    print 'Command: options --sp [PORT]'
		    sys.exit()
    else:
        print 'Command: options --sp [PORT]'
        sys.exit()
except getopt.GetoptError as err:
    print err
    sys.exit()

# Parse command-line arguments are passed as server address
server_address = ('localhost',port)

# Generates a Random number which is used as an identifier to identify a client
def generate_random_number():
    random_number = random.SystemRandom()
    pseudo_random_number = str(random_number.random())
    return pseudo_random_number[:10]

# This part of code checks whether or not client is connected and is in the group
def is_client_connected(identifier, client_address):
    if activeusers.has_key(identifier) and (client_address[0],client_address[1]) in activeusers.values():
        return True
    else:
        return False

# This part of code sends data to client in case of error and checks for 
def send_data_to_client(data): 
    unmarshalled_message = ('Incoming','<From '+str(server_address[0])+':'+str(server_address[1])+'> '+data)
    marshalled_message = pickle.dumps(unmarshalled_message)
    s.sendto(marshalled_message,(client_address[0],client_address[1]))

# This part of code sends data to all clients in group
def send_data_to_group(data):    
    unmarshalled_message = ('Incoming','<From '+str(client_address[0])+':'+str(client_address[1])+'> '+data)
    marshalled_message = pickle.dumps(unmarshalled_message)
    for eachuser in activeusers.values():   
        s.sendto(marshalled_message, eachuser)   
    
# this part sends identifier to client so that he can use that in next messages so that no one can hijack his session
def send_identifier_to_client(data):
    unmarshalled_message = ('Identifier',str(data))
    marshalled_message = pickle.dumps(unmarshalled_message)
    s.sendto(marshalled_message,(client_address[0],client_address[1]))


def connect():
    
    identifier = 0
    print 'Server Initialized...'
    global client_address
    #now keep talking with the client
    while 1:
        marhalled_data,client_address = s.recvfrom(1024)
        actual_message = pickle.loads(marhalled_data)
        keyword = actual_message[0]
        message = actual_message[1]
        identifier = actual_message[2]	

	# check if client is connected
        if is_client_connected(identifier, client_address):
            if keyword == 'Message':
                send_data_to_group(message)
            else:
                send_data_to_client('Please follow protocol')
        else:
            if keyword == 'Greeting' and message == 'Greeting':
                identifier = generate_random_number()
                #print 'Connection initiation request from client ' + str(client_address[0]) + ':' + str(client_address[1])+' '+ message
                activeusers[identifier]=(client_address[0],client_address[1]) # this registers client into the group
                send_identifier_to_client(str(identifier))
            else:    
                send_data_to_client('Please greet the server first')

            
def main():
    global s 
    #Creates a UDP scoket and setsockopt() makes the scoket reusable if its in TIME_WAIT state
    try:
        s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
        s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    except:
        print "Socket failed."
    #Bind socket to local host and port from command line arguements
    try:
        s.bind(server_address)
    except socket.error as msg:
        print 'Bind failed. Error Code : ' + str(msg[0]) + ' Message ' + msg[1]
    
    connect()
main()
