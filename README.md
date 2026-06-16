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

## 🏃 How to Run Locally
Prerequisites
Java 17 or higher

Gradle 8.5 or higher (or use wrapper)

Clone & Build
bash
git clone https://github.com/sohanakhan45566-sudo/CodeAlpha-Task3.git
cd CodeAlpha-Task3
Build the Application
bash
./gradlew build
Run Tests
bash
./gradlew test
Run the Application
bash
./gradlew run
Generate JAR
bash
./gradlew jar
java -jar build/libs/CodeAlpha-Task3-1.0.0.jar
## 🔄 CI/CD Pipeline Workflow
The GitHub Actions pipeline automatically:

✅ Checkout - Pulls the latest code

✅ Setup JDK 17 - Configures Java environment

✅ Setup Gradle - Installs Gradle

✅ Build - Compiles the application

✅ Test - Runs all JUnit tests

✅ Upload Artifact - Stores JAR file for download

View Pipeline Status
https://github.com/sohanakhan45566-sudo/CodeAlpha-Task3/actions/workflows/gradle.yml/badge.svg

📊 Test Results
Test Case	Status
testGetGreeting()	✅ Passed
testMainMethodRuns()	✅ Passed
testStringUtilsIsWorking()	✅ Passed
📁 Project Structure
text
CodeAlpha-Task3/
├── .github/
│   └── workflows/
│       └── gradle.yml          # CI/CD pipeline
├── src/
│   ├── main/
│   │   └── java/com/codealpha/
│   │       └── App.java        # Main application
│   └── test/
│       └── java/com/codealpha/
│           └── AppTest.java    # Unit tests
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── build.gradle                # Build configuration
├── settings.gradle             # Project settings
├── gradlew                     # Gradle wrapper (Linux/Mac)
├── gradlew.bat                 # Gradle wrapper (Windows)
├── .gitignore                  # Git ignore rules
└── README.md                   # Documentation
🎯 DevOps Principles Demonstrated
Principle	Implementation
Automation	Gradle build & GitHub Actions CI/CD
Continuous Integration	Every push triggers build & test
Continuous Delivery	JAR artifact generated for deployment
Version Control	Git with meaningful commits
Testing	JUnit unit tests
Dependency Management	Gradle with Maven Central
## 🐛 Troubleshooting
Build Fails
bash
./gradlew clean build
Test Fails
bash
./gradlew test --info
Permission Denied (Linux/Mac)
bash
chmod +x gradlew
./gradlew build
## 📸 Screenshots
### Pipeline Success
![Pipeline Success](screenshots/pipeline-success.png)

### Build Logs
![Build Logs](screenshots/build-logs.png)

### Artifact Upload
![Artifact Upload](screenshots/artifact-upload.png)


👨‍💻 Author
Sohana Akbar
DevOps Intern | CodeAlpha

https://img.shields.io/badge/GitHub-Profile-black?logo=github
https://img.shields.io/badge/LinkedIn-Profile-blue?logo=linkedin

📄 License
This project is created for CodeAlpha DevOps Internship evaluation purposes.

🏆 Task Status
✅ COMPLETED - All requirements fulfilled.

Built with ❤️ by Sohana Akbar
