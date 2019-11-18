FROM openjdk:12-alpine

ADD pet-clinic-web-0.0.2-SNAPSHOT.jar /pet-clinic.jar
RUN sh -c "touch /pet-clinic.jar"

ENTRYPOINT ["java","-Djava.security.egd=file:/dev.urandom","-jar","/pet-clinic.jar"]