FROM java:8

WORKDIR  /usr/local/custom


ADD ./target/demo-0.0.1-SNAPSHOT.jar demo.jar

EXPOSE 8099

ENTRYPOINT ["java","-jar","demo.jar", "--server.port=8099"]