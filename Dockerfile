FROM openjdk:11
FROM mysql:latest
FROM tomcat:latest
EXPOSE 8090
ADD \target\BookApp-0.0.1-SNAPSHOT.war BookApp-0.0.1-SNAPSHOT
ENTRYPOINT [ "java", "-war" "BookApp-0.0.1-SNAPSHOT" ]