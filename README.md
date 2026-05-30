#  Shopping Cart Backend System

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-6DB33F?style=flat&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-4169E1?style=flat&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=flat&logo=hibernate&logoColor=white)](https://hibernate.org/)
[![Spring Security](https://img.shields.io/badge/Spring%20Security-JWT-6DB33F?style=flat&logo=springsecurity&logoColor=white)](https://spring.io/projects/spring-security)

> A robust backend system for an e-commerce application built with Spring Boot, featuring secure authentication, shopping cart management, product handling, and order processing.

---

#  Table of Contents

- [About](#about)
- [Features](#features)
- [Security](#security)
- [Technologies](#technologies-used)
- [Architecture](#architecture)
- [Class Diagram](#class-diagram)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [API Testing](#api-testing)
- [Project Structure](#project-structure)
- [Future Improvements](#future-improvements)
- [Contributing](#contributing)
- [Author](#author)

---

#  About

Shopping Cart Backend System is a backend application designed to handle the core functionalities of an e-commerce platform.

The application provides secure and scalable RESTful APIs for:

-  Product management
-  User management
-  Shopping cart operations
-  Order processing
-  Authentication & authorization

The system follows modern backend development practices using **Spring Boot**, **Spring Security**, and **PostgreSQL**.

---

#  Features

##  User Management
- Create users
- Update user information
- Delete users
- User authentication
- Role management

##  Product Management
- Add products
- Update products
- Delete products
- Retrieve all products
- Product search functionality

##  Shopping Cart System
- Add items to cart
- Update item quantity
- Remove items from cart
- View cart details

##  Order Processing
- Place orders
- Retrieve orders
- Track order details

## 🔗 REST API
- RESTful API architecture
- JSON-based communication
- Layered backend structure

## 🗄 Database Persistence
- Spring Data JPA
- Hibernate ORM
- PostgreSQL integration

---

#  Security

This project uses **Spring Security** for authentication and authorization.

### Security Features

- JWT Authentication
- BCrypt password encryption
- Role-based access control (**ADMIN / USER**)
- Protected REST endpoints
- Stateless authentication system

### Authentication Flow

```text
User Login → JWT Token Generation → Token Validation → Access Protected APIs
```

---

#  Technologies Used

## Backend
- **Java**
- **Spring Boot**
- **Spring Security**
- **Spring Data JPA**
- **Hibernate**

## Database
- **PostgreSQL**

## API Testing
- **Postman**

## Development Tools
- **Maven**
- **Git & GitHub**
- **IntelliJ IDEA / Eclipse**

---

#  Architecture

The project follows a layered backend architecture.

```text
┌────────────────────┐
│   Controller Layer │ → REST API Endpoints
└─────────┬──────────┘
          │
          ▼
┌────────────────────┐
│    Service Layer   │ → Business Logic
└─────────┬──────────┘
          │
          ▼
┌────────────────────┐
│  Repository Layer  │ → Database Access
└─────────┬──────────┘
          │
          ▼
┌────────────────────┐
│    PostgreSQL DB   │
└────────────────────┘
```

---

#  Class Diagram

<img width="824" height="434" alt="Class Diagram" src="https://github.com/user-attachments/assets/07ca0a8d-9c3a-4b4e-8963-198a18be0d76" />

---

#  Screenshots

##  Login
<img width="1425" height="1020" alt="login" src="https://github.com/user-attachments/assets/3281a15a-15b1-4282-9e4b-a51ef308bf2a" />

---

##  Get User By ID
<img width="1432" height="1010" alt="getuserbyid" src="https://github.com/user-attachments/assets/e9ea0222-75bf-4aef-8302-eb7f928944da" />

---

##  Place Order
<img width="1424" height="1006" alt="placeorder" src="https://github.com/user-attachments/assets/085adbe5-5eea-41bb-a4e9-f9e808b5114e" />

---

##  Get Order
<img width="1431" height="1014" alt="getorder" src="https://github.com/user-attachments/assets/783cffff-e0e1-4d67-bd84-5a869f6dc206" />

---

##  Get All Products
<img width="1425" height="1028" alt="getallproducts" src="https://github.com/user-attachments/assets/b1833011-2e14-4de7-825d-58cfd39eeaa0" />

---

##  Add New Product
<img width="1420" height="1008" alt="addnewproduct" src="https://github.com/user-attachments/assets/52cf7870-9cb3-4de1-b8a7-b2e3f9d3344a" />

---

##  Update Item Quantity
<img width="1408" height="997" alt="updateitemquantitylogin" src="https://github.com/user-attachments/assets/90f86f4f-02f3-4505-80b8-74269695c655" />

---

##  Update Item Quantity Without Login
<img width="1431" height="1015" alt="updateitemquantity" src="https://github.com/user-attachments/assets/eeeda8d8-8fc5-4c63-8bef-dfc77e1484bf" />

---

#  Installation

## Prerequisites

Make sure you have installed:

- Java JDK 17+
- PostgreSQL
- Maven
- Git
- IntelliJ IDEA or Eclipse

---

#  Clone the Repository

```bash
git clone https://github.com/Belak17/shoppingcart.git
cd shoppingcart
```

---

#  Configure the Database

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

#  Build the Project

```bash
mvn clean install
```

---

#  Run the Application

```bash
mvn spring-boot:run
```

The server will start on:

```text
http://localhost:8080
```

---

#  API Testing

You can test the APIs using:

- Postman
- Insomnia
- Swagger (if enabled)

### Example Authentication Flow

1. Login using credentials
2. Receive JWT token
3. Add token to Authorization header

```text
Authorization: Bearer your_token
```

4. Access protected endpoints

---

#  Project Structure

```text
shoppingcart/
│
├── src/main/java/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   ├── security/
│   └── config/
│
├── src/main/resources/
│   └── application.properties
│
├── pom.xml
└── README.md
```

---

#  Future Improvements

- Payment gateway integration
- Product image upload
- Email notifications
- Swagger API documentation
- Docker support
- Microservices architecture
- Redis caching
- Unit and integration testing

---

#  Contributing

Contributions are welcome!

## Steps

1. Fork the repository

2. Create a feature branch

```bash
git checkout -b feature-name
```

3. Commit your changes

```bash
git commit -m "Add new feature"
```

4. Push the branch

```bash
git push origin feature-name
```

5. Open a Pull Request

---

#  Report Issues

If you find a bug or would like to suggest improvements, feel free to open an issue in the repository.

---

#  Author

## Kaleb AKAKPO

- Backend Developer
- Java & Spring Boot Enthusiast

###  LinkedIn
[LinkedIn Profile](https://www.linkedin.com/in/kaleb-akakpo-5a9431355/)

---

<div align="center">

###  If you like this project, consider giving it a star on GitHub!

</div>
