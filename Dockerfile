FROM adoptopenjdk/openjdk11:jdk-11.0.2.7-alpine-slim
COPY java.security /opt/java/openjdk/conf/security
COPY target/addresses-service-0.0.1-SNAPSHOT.jar .
EXPOSE 8085
CMD java -jar addresses-service-0.0.1-SNAPSHOT.jar

