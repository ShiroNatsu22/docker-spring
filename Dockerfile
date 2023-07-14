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

COPY src ./src
COPY config ./config
COPY entrypoint.sh ./entrypoint.sh


RUN ./mvnw dependency:go-offline

RUN ./mvnw clean install -DskipTests

USER ${USER}

WORKDIR /var/www

CMD ["./mvnw", "spring-boot:run"]