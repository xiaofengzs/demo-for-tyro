FROM maven:3.6.3-jdk-8

WORKDIR /app

COPY ./ /app

EXPOSE 8080

RUN ["mvn", "clean", "install"]

CMD ["java", "-jar", "demo-for-tyro-0.0.1-SNAPSHOT.jar"]
