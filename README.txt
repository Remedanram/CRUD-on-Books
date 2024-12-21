Mini Project - Spring Boot with PostgreSQL, Swagger & Responsive Frontend
Overview
This mini project integrates a Spring Boot backend with PostgreSQL, offering CRUD (Create, Read, Update, Delete) operations for managing books. The backend uses JDBC to connect to the PostgreSQL database and provides a Swagger-powered interface for API documentation and testing. The front-end is a responsive application built using HTML, CSS, and JavaScript, which interacts with the backend to manage book data.

Features:
CRUD Operations for managing books (Create, Read, Update, Delete).
PostgreSQL Integration using JDBC for data storage and management.
Swagger Documentation to visualize and test API endpoints.
Responsive Front-End built with HTML, CSS, and JavaScript.
Interaction between front-end and backend using RESTful APIs.
Technologies Used:

Backend:

Spring Boot: Framework for building Java-based backend applications.
PostgreSQL: Open-source relational database.
JDBC: Java Database Connectivity for integrating PostgreSQL with Spring Boot.
Swagger: API documentation and testing tool.

Frontend:

HTML: Markup language for building the UI.
CSS: Styling language for making the UI responsive.
JavaScript: For interacting with the backend APIs (via Fetch API or AJAX).
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