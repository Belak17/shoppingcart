# Shopping Cart Backend System

A RESTful e-commerce backend application built with Java, Spring Boot, Spring Security, and PostgreSQL. The project implements core e-commerce operations, including product management, user management, shopping cart operations, and order processing, with JWT-based authentication and role-based access control.

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-6DB33F?style=flat&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-JWT-6DB33F?style=flat&logo=springsecurity&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-4169E1?style=flat&logo=postgresql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=flat&logo=hibernate&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?style=flat&logo=apachemaven&logoColor=white)

---

## Table of Contents

- [Overview](#overview)
- [Key Features](#key-features)
- [Security](#security)
- [Technology Stack](#technology-stack)
- [Technical Highlights](#technical-highlights)
- [Architecture](#architecture)
- [Class Diagram](#class-diagram)
- [Screenshots](#screenshots)
- [Prerequisites](#prerequisites)
- [Installation and Setup](#installation-and-setup)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Testing](#api-testing)
- [Project Structure](#project-structure)
- [Future Improvements](#future-improvements)
- [Contributing](#contributing)
- [Author](#author)

---

## Overview

Shopping Cart Backend System is a backend application designed to provide the core functionality of an e-commerce platform through RESTful APIs.

Built with Spring Boot, the application manages products, users, shopping carts, and orders while using PostgreSQL for persistent data storage.

Spring Security and JSON Web Tokens (JWT) provide authentication and authorization for protected endpoints.

The project focuses on backend development fundamentals, including REST API design, database persistence, security, and separation of business logic from data access.

### Main Objectives

- Develop RESTful APIs for e-commerce operations.
- Implement secure user authentication and authorization.
- Manage product information and shopping cart operations.
- Handle order creation and retrieval.
- Persist application data using PostgreSQL and Spring Data JPA.
- Organize backend components using a layered architecture.

---

## Key Features

### 1. User Management

- Create user accounts.
- Retrieve user information.
- Update user information.
- Delete users.
- Authenticate users.
- Manage user roles.

### 2. Product Management

- Add new products.
- Update existing products.
- Delete products.
- Retrieve all products.
- Search for products.

### 3. Shopping Cart Management

- Add items to a shopping cart.
- Update item quantities.
- Remove items from a cart.
- Retrieve cart information.

### 4. Order Processing

- Place orders.
- Retrieve order information.
- Access order details.

### 5. RESTful API

- HTTP-based API endpoints.
- JSON request and response handling.
- Separation of controllers, services, and repositories.
- Integration with persistent database storage.

---

## Security

The application uses Spring Security to manage authentication and access to protected endpoints.

### Security Features

- JWT-based authentication.
- Password hashing using BCrypt.
- Role-based access control.
- Protected REST API endpoints.
- Stateless authentication.

### Authentication Flow

```text
User Login
    |
    v
Credential Validation
    |
    v
JWT Generation
    |
    v
Client Receives Token
    |
    v
Token Included in Subsequent Requests
    |
    v
Token Validation
    |
    v
Access to Authorized Endpoints
```

For authenticated requests, the client includes the JWT in the HTTP Authorization header:

```http
Authorization: Bearer your_token
```

The application validates the token before granting access to protected resources.

---

## Technology Stack

| Category | Technologies |
|---|---|
| Programming Language | Java |
| Backend Framework | Spring Boot |
| API Development | Spring MVC, REST |
| Security | Spring Security, JWT |
| Password Hashing | BCrypt |
| Persistence | Spring Data JPA |
| ORM | Hibernate |
| Database | PostgreSQL |
| Data Exchange | JSON |
| API Testing | Postman |
| Build Tool | Maven |
| Version Control | Git, GitHub |
| Development Environment | IntelliJ IDEA / Eclipse |

---

## Technical Highlights

This project demonstrates practical experience with backend development concepts:

- RESTful API design and implementation.
- Authentication and authorization using Spring Security.
- JWT-based stateless authentication.
- Password hashing with BCrypt.
- Role-based access control.
- Object-relational mapping with Hibernate.
- Database persistence with Spring Data JPA.
- PostgreSQL integration.
- Layered architecture.
- HTTP request and response handling.
- API testing with Postman.

---

## Architecture

The application follows a layered architecture to separate HTTP request handling, business logic, and database operations.

```text
                  Client
                    |
                    | HTTP / JSON
                    v
          +----------------------+
          |   Security Layer     |
          | Spring Security/JWT  |
          +----------------------+
                    |
                    v
          +----------------------+
          |  Controller Layer   |
          | REST API Endpoints  |
          +----------------------+
                    |
                    v
          +----------------------+
          |    Service Layer    |
          |    Business Logic   |
          +----------------------+
                    |
                    v
          +----------------------+
          |  Repository Layer   |
          |   Spring Data JPA   |
          +----------------------+
                    |
                    v
          +----------------------+
          |   Hibernate ORM     |
          +----------------------+
                    |
                    v
          +----------------------+
          | PostgreSQL Database |
          +----------------------+
```

### Layer Responsibilities

- **Security Layer:** Handles authentication, token validation, and access control.
- **Controller Layer:** Exposes REST endpoints and processes incoming HTTP requests.
- **Service Layer:** Implements business logic for users, products, shopping carts, and orders.
- **Repository Layer:** Provides database access through Spring Data JPA.
- **Database Layer:** Stores persistent application data in PostgreSQL.

This architecture promotes separation of concerns and makes the application easier to maintain and extend.

---

## Class Diagram

The following diagram illustrates the application's class structure and relationships.

<img width="824" height="434" alt="Class Diagram" src="https://github.com/user-attachments/assets/07ca0a8d-9c3a-4b4e-8963-198a18be0d76" />

---

## Screenshots

The following screenshots demonstrate selected API operations and application behavior.

### 1. User Authentication

<img width="1425" height="1020" alt="Login" src="https://github.com/user-attachments/assets/3281a15a-15b1-4282-9e4b-a51ef308bf2a" />

### 2. Retrieve User by ID

<img width="1432" height="1010" alt="Get User By ID" src="https://github.com/user-attachments/assets/e9ea0222-75bf-4aef-8302-eb7f928944da" />

### 3. Place an Order

<img width="1424" height="1006" alt="Place Order" src="https://github.com/user-attachments/assets/085adbe5-5eea-41bb-a4e9-f9e808b5114e" />

### 4. Retrieve an Order

<img width="1431" height="1014" alt="Get Order" src="https://github.com/user-attachments/assets/783cffff-e0e1-4d67-bd84-5a869f6dc206" />

### 5. Retrieve All Products

<img width="1425" height="1028" alt="Get All Products" src="https://github.com/user-attachments/assets/b1833011-2e14-4de7-825d-58cfd39eeaa0" />

### 6. Add a New Product

<img width="1420" height="1008" alt="Add New Product" src="https://github.com/user-attachments/assets/52cf7870-9cb3-4de1-b8a7-b2e3f9d3344a" />

### 7. Update Item Quantity While Authenticated

<img width="1408" height="997" alt="Update Item Quantity With Login" src="https://github.com/user-attachments/assets/90f86f4f-02f3-4505-80b8-74269695c655" />

### 8. Update Item Quantity Without Login

<img width="1431" height="1015" alt="Update Item Quantity Without Login" src="https://github.com/user-attachments/assets/eeeda8d8-8fc5-4c63-8bef-dfc77e1484bf" />

---

## Prerequisites

Before running the application, make sure the following tools are installed:

- Java JDK 17 or a compatible version required by the project.
- PostgreSQL.
- Maven.
- Git.
- IntelliJ IDEA, Eclipse, or another Java IDE.

---

## Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/Belak17/shoppingcart.git
cd shoppingcart
```

### 2. Create the Database

Create a PostgreSQL database for the application.

For example:

```sql
CREATE DATABASE shoppingcart_db;
```

Make sure the PostgreSQL server is running and that the database user has the necessary permissions.

### 3. Configure the Database Connection

Update the database settings in `application.properties` or configure the corresponding environment variables.

See the [Configuration](#configuration) section for details.

### 4. Build the Project

Run the following command from the project root:

```bash
mvn clean install
```

This command compiles the application, executes the configured tests, and packages the project.

### 5. Start the Application

Run:

```bash
mvn spring-boot:run
```

The application will start on the configured server port.

By default, Spring Boot applications use:

```text
http://localhost:8080
```

The actual port may differ depending on the application configuration.

---

## Configuration

The application requires a valid PostgreSQL connection.

### Database Configuration

The following example illustrates the required properties in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/shoppingcart_db
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
```

Set the database credentials through environment variables rather than committing sensitive information to the repository.

### Windows PowerShell

```powershell
$env:DB_USERNAME="your_username"
$env:DB_PASSWORD="your_password"
```

### Linux or macOS

```bash
export DB_USERNAME="your_username"
export DB_PASSWORD="your_password"
```

Replace the example values with your actual PostgreSQL credentials.

**Security note:** The `spring.jpa.hibernate.ddl-auto=update` setting is convenient for development. For production environments, use a controlled database migration strategy and review the database schema changes before deployment.

---

## Running the Application

Once the database has been configured:

1. Start PostgreSQL.
2. Verify the database connection settings.
3. Build the project using Maven.
4. Start the Spring Boot application.
5. Send requests to the available REST endpoints using an API client.

Example:

```bash
mvn spring-boot:run
```

The server should become available at the configured host and port.

---

## API Testing

The REST API can be tested using tools such as:

- Postman
- Insomnia
- cURL

Swagger UI can also be used if API documentation has been configured in the project.

### Example Authentication Workflow

**Step 1: Authenticate**

Send a login request with valid credentials to the authentication endpoint.

**Step 2: Retrieve the JWT**

If authentication succeeds, retrieve the token returned by the application.

**Step 3: Include the Token**

Add the token to the Authorization header of requests that require authentication.

```http
Authorization: Bearer your_token
```

**Step 4: Access Protected Endpoints**

Send requests to the protected API endpoints permitted for the authenticated user's role.

### Example HTTP Request

```http
GET /api/products HTTP/1.1
Host: localhost:8080
Accept: application/json
```

The endpoint shown above is an illustrative example. Use the actual routes defined in the application.

---

## Project Structure

The project follows a conventional Spring Boot structure.

```text
shoppingcart/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       ├── model/
│   │   │       ├── security/
│   │   │       └── config/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

### Main Components

| Component | Responsibility |
|---|---|
| `controller/` | REST API endpoints and HTTP request handling |
| `service/` | Application business logic |
| `repository/` | Database access and persistence operations |
| `model/` | Application entities and domain models |
| `security/` | Authentication, JWT handling, and authorization |
| `config/` | Application configuration |
| `resources/` | Application properties and other resources |
| `test/` | Automated tests, where implemented |

The directory names and organization may vary depending on the actual source code.

---

## Future Improvements

Potential enhancements include:

- Payment gateway integration.
- Product image upload and storage.
- Email notifications for orders and account activities.
- API documentation with Swagger or OpenAPI.
- Docker-based deployment.
- Redis caching for frequently accessed data.
- Expanded unit and integration test coverage.
- Improved request validation and error handling.
- Pagination and sorting for product listings.
- Inventory management and stock validation.
- Order status management.
- Database migrations with Flyway or Liquibase.

These are potential improvements and should not be considered implemented features unless they are present in the current codebase.

---

## Contributing

Contributions and suggestions are welcome.

### How to Contribute

1. Fork the repository.
2. Create a feature branch:

   ```bash
   git checkout -b feature-name
   ```

3. Commit your changes:

   ```bash
   git commit -m "Add new feature"
   ```

4. Push your branch:

   ```bash
   git push origin feature-name
   ```

5. Open a Pull Request describing your changes.

---

## Report Issues

If you encounter a bug or have a suggestion for improvement, open an issue in the GitHub repository.

Please include relevant details about the problem, the steps required to reproduce it, and any error messages that may help identify the cause.

---

## Author

### Kaleb AKAKPO

**Backend Developer | Java & Spring Boot**

Interested in backend engineering, database systems, REST API development, and applied machine learning.

- GitHub: [Belak17](https://github.com/Belak17)
- LinkedIn: [Kaleb AKAKPO](https://www.linkedin.com/in/kaleb-akakpo-5a9431355/)

---

If you find this project useful, consider giving the repository a star on GitHub.
