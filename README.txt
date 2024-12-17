Mini Project - Spring Boot with PostgreSQL and Swagger
Overview
This mini project is developed using Spring Boot, enabling CRUD (Create, Read, Update, Delete) operations. It integrates with a PostgreSQL database using JDBC for data management. Additionally, Swagger is included to simplify API testing and documentation, making it easy to interact with the system.

Features

CRUD Operations:
Create, Read, Update, and Delete functionalities for the core entities.

PostgreSQL Integration:
Uses JDBC to connect to and interact with the PostgreSQL database.

Swagger API Documentation:
Provides a user-friendly interface for testing all available API endpoints.

Technologies Used
Spring Boot: For building the backend application.
JDBC: For connecting and performing operations with the PostgreSQL database.
PostgreSQL: A powerful, open-source relational database.
Swagger: To automatically generate and visualize the RESTful API documentation.
Setup

Clone the repository:
bash
Copy code
git clone <repository_url>

Configure PostgreSQL:
Ensure you have PostgreSQL running locally or on a server.
Update the application.properties or application.properties file with your PostgreSQL database connection details.
Run the application:

Build the project using Maven or Gradle:
bash
Copy code
mvn clean install
Run the application:
bash
Copy code
mvn spring-boot:run
Access Swagger UI:

After the application starts, navigate to http://localhost:8080/swagger-ui/ to view and test the API endpoints.
API Documentation
Swagger provides an interactive interface to test the following endpoints:

GET /api/getbooks: Retrieve a list of books.
POST /api/addbooks: Create a new book.
PUT /api/getbook/{id}: Update book entity.
DELETE /api/delete/{id}: Delete book by ID.
DELETE /api/delete: Delete all book.