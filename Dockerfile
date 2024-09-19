From tomcat:10.1

Run rm -rf /usr/local/tomcat/webapps/*

Coppy *.war /usr/local/tomcat/webapps

EXPOSE 8081

CMD ["catalina.sh","run"]