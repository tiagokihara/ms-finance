FROM openjdk:11
VOLUME /tmp/ms-config
EXPOSE 8888
ADD ./target/fn-config-server-0.0.1-SNAPSHOT.jar fn-config-server.jar
ENTRYPOINT ["java", "-jar", "fn-config-server.jar"]