FROM maven:3.8.6-amazoncorretto-17 as build
WORKDIR /usr/src/app
COPY . .
RUN mvn clean package -X -DskipTests

FROM openjdk:17-ea-10-jdk-slim
WORKDIR /usr/src/app
COPY --from=build ./usr/src/app/target/*.jar ./springwithdocker.jar
ENTRYPOINT java -jar springwithdocker.jar