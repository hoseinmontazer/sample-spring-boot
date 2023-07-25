FROM openjdk:21-ea-20-jdk-bullseye AS build
RUN apt-get update && apt-get -y install \
    maven
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests
RUN ls -lah
RUN ls -lah /app/target/

#FROM openjdk:19-slim-bullseye AS deploy
FROM openjdk:21-ea-20-jdk-bullseye AS deploy
WORKDIR /app

COPY --from=build /app/target/hosein-0.0.1-SNAPSHOT.jar .
CMD java -jar hosein-0.0.1-SNAPSHOT.jar
