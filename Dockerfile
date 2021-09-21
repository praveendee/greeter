FROM maven:3.5-jdk-8-alpine as build
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn install

FROM openjdk:8-jre-alpine
EXPOSE 8080
COPY --from=build /tmp/target/greeter.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]