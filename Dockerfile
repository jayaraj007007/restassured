FROM maven:3.8.6-openjdk-18-slim
USER tester
ENV HOME=/app
RUN mkdir -p $HOME
WORKDIR $HOME
COPY pom.xml pom.xml
RUN mvn clean install
COPY . .
RUN chgrp -R 0 $HOME && chmod -R g=u $HOME
CMD ["mvn", "test"]
