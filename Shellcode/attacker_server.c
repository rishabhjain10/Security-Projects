#include<stdio.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<string.h>
#include<errno.h>
#include<stdlib.h>
#include<arpa/inet.h>
#include <time.h>

#define PORT 1337

main()
{
	time_t timestamp;
	int sock, cli;
	struct sockaddr_in server,client;
	unsigned int len;
	int msg=0;	
	char message[1024];
	int bytes_recieved;
	if((sock=socket(AF_INET,SOCK_STREAM,0)) == -1)
	{
	perror("Socket: ");
	exit(-1);
	}
	
	server.sin_family=AF_INET;
	server.sin_port= htons(PORT);
	server.sin_addr.s_addr=INADDR_ANY;
	bzero(&server.sin_zero,8);

	len = sizeof(struct sockaddr_in);

	if(bind(sock, (struct sockaddr*)&server,len) == -1)
	{
	perror("bind: ");
	exit(-1);
	}

	if(listen(sock,5)==-1)
	{
	perror("listen: ");
	exit(-1);
	}

	while(1)
	{
	if((cli=accept(sock,(struct sockaddr*) &client,&len)) == -1)
	{
	perror("accept: ");
	exit(-1);
	}
	FILE *fp= NULL;
	fp = fopen ("ServerLog.txt", "a+");
	bytes_recieved=recv(cli,&msg,1024,0);
	int temp=ntohl(msg);	
	fprintf(fp, "\n%sIP Address : %s\n",ctime(&timestamp),inet_ntoa(client.sin_addr));
	fprintf(fp, "euid : %d\n",temp);
	fflush(fp);
	
	while(bytes_recieved > 0){
	bytes_recieved=recv(cli,&msg,1024,0);
	int tmp=ntohl(msg);
	fprintf(fp, "gid : %d\n",tmp);
	fflush(fp);
	fclose(fp);
	}
	}	
	
}
