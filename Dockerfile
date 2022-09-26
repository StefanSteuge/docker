FROM ubuntu:20.04

RUN apt update
RUN apt -y install openjdk-11-jdk
RUN apt -y install wget

WORKDIR /var/www/docker

COPY src/Main.java Main.java

RUN wget https://repo1.maven.org/maven2/mysql/mysql-connector-java/5.1.49/mysql-connector-java-5.1.49.jar

RUN javac Main.java

CMD java -cp  mysql-connector-java-5.1.49.jar:. Main