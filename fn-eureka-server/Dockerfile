FROM openjdk:11
VOLUME /tmp/ms-config
EXPOSE 8761
ADD ./target/fn-eureka-server-0.0.1-SNAPSHOT.jar fn-eureka-server.jar
ENTRYPOINT ["java", "-jar", "fn-eureka-server.jar"]