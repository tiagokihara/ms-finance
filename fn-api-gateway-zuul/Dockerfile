FROM openjdk:11
VOLUME /tmp/ms-config
EXPOSE 8765
ADD ./target/fn-api-gateway-zuul-0.0.1-SNAPSHOT.jar fn-api-gateway-zuul.jar
ENTRYPOINT ["java", "-jar", "fn-api-gateway-zuul.jar"]