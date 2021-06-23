FROM openjdk:11
VOLUME /tmp/ms-config
ADD ./target/fn-oauth-0.0.1-SNAPSHOT.jar fn-oauth.jar
ENTRYPOINT ["java", "-jar", "fn-oauth.jar"]