# Employee Management System

A Java Spring Boot WAR application designed for a DevOps CI/CD demonstration using:

- GitHub
- Jenkins
- Maven
- SonarQube
- Nexus Repository
- Apache Tomcat

## Application

Base URL:

http://localhost:8080/employee-management

Health:

http://localhost:8080/employee-management/health

Employees:

http://localhost:8080/employee-management/api/employees

## Build

```bash
mvn clean package
```

WAR output:

```text
target/employee-management.war
```

## Run Tests

```bash
mvn test
```

## SonarQube

```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=employee-management \
  -Dsonar.host.url=http://YOUR-SONARQUBE-SERVER:9000
```

## Tomcat

Copy:

```text
target/employee-management.war
```

to:

```text
TOMCAT_HOME/webapps/
```

Start Tomcat and open:

```text
http://localhost:8080/employee-management/health
```

## CI/CD Flow

GitHub
-> Jenkins
-> Maven Build
-> Unit Tests
-> SonarQube
-> Quality Gate
-> WAR Package
-> Nexus
-> Tomcat
-> Smoke Test
