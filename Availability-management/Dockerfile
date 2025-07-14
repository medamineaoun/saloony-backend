FROM openjdk:17
EXPOSE 8083
ADD target/availabilitymng-0.0.1-SNAPSHOT.jar availability-management.jar
ENTRYPOINT ["java","-jar","availability-management.jar"]