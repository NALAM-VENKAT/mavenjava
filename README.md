# MavenJava

A small Maven JAR project for the Jenkins CI/CD practical.

## Requirements
- JDK 8 or later
- Apache Maven 3.6 or later

## Build and test
Run these commands from this directory:

```bash
mvn clean
mvn compile
mvn test
mvn package
mvn install
```

The JAR is created at `target/MavenJava-1.0-SNAPSHOT.jar`.
JUnit test reports are written to `target/surefire-reports/`.
