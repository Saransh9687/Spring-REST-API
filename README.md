# Spring-REST-API
A basic Spring Boot REST API that supports user creation and deletion using MVC architecture and JPA.


A Spring Boot REST API implementing basic user management functionality, including **creating** and **deleting users**.  
The project follows a clean **layered architecture** (Controller → Service → Repository), uses **DTOs** for request/response handling, and **JPA (EntityManager)** for database operations.

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web (REST APIs)**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**

---

## 🧱 Project Architecture

- **Controller**: Handles HTTP requests and responses
- **Service**: Contains business logic
- **Repository**: Database interaction using `EntityManager`
- **DTOs**: Used for request and response mapping
- **Entity**: Represents database tables

---

## 📌 Features

- Create a new user
- Delete an existing user
- Clean separation of concerns
- RESTful API design
- DTO-based request/response handling


**Important Note: application.properties**

The application.properties file has been intentionally removed from this repository.

This is done to:

Avoid committing sensitive information (DB credentials)

Allow users to configure their own environment

🔧 You must create your own application.properties file

Create the file at src/main/resources/application.properties

Sample configuartion:

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

server.port=8080


How to Run the Project :

Clone the repository
Create your own application.properties
Ensure MySQL is running and the database exists
Run the application: mvn spring-boot:run
or run the main class from your IDE

