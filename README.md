# Micronaut 3.5.0 Workshop
## Project Creation
1. [Download micronaut framework](https://micronaut.io/download/) 
2. go to launch.micronaut.io
3. generate project : You can use any of the options below
	1. Command Line : mn create-app --build=gradle --jdk=11 --lang=java --test=junit --features=views-thymeleaf com.shishir.mn
	2. CUrl: curl --location --request GET 'https://launch.micronaut.io/create/default/com.shishir.mnlearning?lang=JAVA&build=GRADLE&test=JUNIT&javaVersion=JDK_11&features=views-thymeleaf' --output micronaut.zip
	3. Download zip file
	4. Push to Git
### Project Details
Application Type: Micronaut Application
Java Version: 11
Micronaut Version: 3.5.0 
Language: Java
Build Tool: Gradle 
Test Framework: JUnit

### Dependencies
views-themeleaf

## Running the project
1. Open the project in Intellij IDE
2. Enable annotation processor in Intellij
    a. go to file > settings > Annotation Processors
    b. enable annotation processors
2. use gradle boot tool command to start the project
	1. ./gradlew run

	