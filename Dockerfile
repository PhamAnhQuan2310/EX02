FROM tomcat:10.1

RUN rm -rf /usr/local/tomcat/webapps/*

COPY *.war /usr/local/tomcat/webapps

EXPOSE 8081

CMD ["catalina.sh", "run"]