########################################################
# Dockerfile per l'applicazione microservizio2 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/microservizio2-0.0.1-SNAPSHOT.jar microservizio2.jar

EXPOSE 8090:8090

ENTRYPOINT ["java","-jar","microservizio2.jar","--server.port=8090"]
