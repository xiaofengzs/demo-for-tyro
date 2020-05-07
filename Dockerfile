FROM maven:3.6.3-jdk-8 as builder
WORKDIR /app
COPY ./ /app
EXPOSE 8080
RUN ["mvn", "clean", "install"]

FROM adoptopenjdk:8-jdk-openj9-bionic as prod
WORKDIR /app
COPY --from=0 /app/target/demo-for-tyro-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "demo-for-tyro-0.0.1-SNAPSHOT.jar"]


