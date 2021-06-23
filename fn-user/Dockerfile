FROM openjdk:11
VOLUME /tmp/ms-config
ADD ./target/fn-user-0.0.1-SNAPSHOT.jar fn-user.jar
ENTRYPOINT ["java", "-jar", "fn-user.jar"]