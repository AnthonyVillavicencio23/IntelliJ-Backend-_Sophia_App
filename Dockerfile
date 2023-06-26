FROM openjdk:17
VOLUME /tmp
EXPOSE 8086
ARG JAR_FILE=target/Sophia_App_Backend-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} Sophia_App_Backend.jar
ENTRYPOINT ["java","-jar","/Sophia_App_Backend.jar"]