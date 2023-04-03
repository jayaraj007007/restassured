FROM maven:3.8.6-openjdk-18-slim
ENV HOME=/app
RUN mkdir -p $HOME
WORKDIR $HOME
COPY pom.xml pom.xml
RUN mvn clean install
COPY . .
CMD ["mvn", "test"]
