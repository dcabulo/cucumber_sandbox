FROM maven:3.6-jdk-8-slim
WORKDIR /sample
COPY src /sample/src
COPY pom.xml /sample
COPY testng.xml /sample
COPY entrypoint.sh /sample

CMD ["sh", "entrypoint.sh"]