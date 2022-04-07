FROM openjdk:11
EXPOSE 8761
ADD /target/diskover-0.0.1-SNAPSHOT.jar diskover.jar
ENTRYPOINT ["java","-jar","diskover.jar"]