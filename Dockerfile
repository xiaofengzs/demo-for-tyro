FROM openjdk

WORKDIR /app

COPY ./target /app

EXPOSE 8080

CMD ["java", "-jar", "demo-for-tyro-0.0.1-SNAPSHOT.jar"]
