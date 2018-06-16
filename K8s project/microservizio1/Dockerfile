########################################################
# Dockerfile per l'applicazione microservizio1 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/microservizio1-0.0.1-SNAPSHOT.jar microservizio1.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","microservizio1.jar"]
