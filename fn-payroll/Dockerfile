FROM openjdk:11
VOLUME /tmp/ms-config
ADD ./target/fn-payroll-0.0.1-SNAPSHOT.jar fn-payroll.jar
ENTRYPOINT ["java", "-jar", "fn-payroll.jar"]