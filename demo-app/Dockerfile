FROM maven as build

COPY pom.xml /app/pom.xml
RUN mvn -f /app/pom.xml dependency:resolve dependency:resolve-plugins
COPY src /app/src
RUN mvn -f /app/pom.xml clean install

FROM openjdk:17-alpine
ARG JAR_FILE=*.jar
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000","-jar","/app.jar"]