FROM openjdk:11.0.4-jre-slim
#Kubernetes deployment
RUN mkdir /app

WORKDIR /app

ADD ./target/escooters-mejnik-orders-1.0.0-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "escooters-mejnik-orders-1.0.0-SNAPSHOT.jar"]
