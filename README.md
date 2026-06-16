# 🚀 CodeAlpha DevOps Internship - Task 3

## Java Application with Gradle & CI/CD Pipeline

![CI/CD Pipeline](https://github.com/sohanakhan45566-sudo/CodeAlpha-Task3/actions/workflows/gradle.yml/badge.svg)
![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Gradle](https://img.shields.io/badge/Gradle-8.5-green.svg)
![GitHub Actions](https://img.shields.io/badge/GitHub%20Actions-Automated-brightgreen.svg)

---

## 📋 Task Requirements

| Requirement | Status |
|-------------|--------|
| Gradle build automation | ✅ |
| External dependency management | ✅ |
| Unit tests with JUnit 5 | ✅ |
| CI/CD pipeline integration | ✅ |
| Continuous delivery (artifact upload) | ✅ |
| Full documentation | ✅ |

---

## 🛠️ Technology Stack

- **Java 17** - Programming language
- **Gradle 8.5** - Build automation tool
- **JUnit 5** - Testing framework
- **Apache Commons Lang3** - Utility library
- **GitHub Actions** - CI/CD pipeline
- **SLF4J** - Logging framework

---

## 📦 Dependencies

```gradle
dependencies {
    implementation 'org.apache.commons:commons-lang3:3.14.0'
    implementation 'org.slf4j:slf4j-simple:2.0.13'
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.2'
}
