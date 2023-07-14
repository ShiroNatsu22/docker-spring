FROM eclipse-temurin:19-jdk-focal as java-spring

ARG UID=1000
ARG GID=1000
ARG USER=www-data

RUN usermod -u $UID ${USER}
RUN groupmod -g $GID ${USER}

COPY .mvn/ .mvn
COPY mvnw pom.xml ./


RUN mkdir /var/www
RUN chown $UID:$GID /var/www
RUN apt-get update && apt-get install dos2unix
COPY src ./src
COPY config ./config
COPY entrypoint.sh ./entrypoint.sh

RUN dos2unix mvnw && dos2unix entrypoint.sh
RUN chmod +x mvnw && chmod +x entrypoint.sh

RUN ./mvnw dependency:go-offline

RUN ./mvnw clean install -DskipTests

USER ${USER}

WORKDIR /var/www

CMD ["./mvnw", "spring-boot:run"]