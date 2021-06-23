FROM openjdk:11
VOLUME /tmp/ms-config
ADD ./target/fn-investor-0.0.1-SNAPSHOT.jar fn-investor.jar
ENTRYPOINT ["java", "-jar", "fn-investor.jar"]