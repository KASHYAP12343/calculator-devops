FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/*.jar calculator.jar

ENTRYPOINT ["java","-jar","calculator.jar"]
