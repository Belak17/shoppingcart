# Shopping Cart Backend System 
##  A Shopping cart Backend System for an E-Commerce Application built following a video on freeCodeCamp
##  Description
This project is a backend application designed to handle the core functionality of an e-commerce shopping cart 
system.It provides RESTful APIs for managing products, users, and cart operations. The system allows users to 
browse products, add them to a cart, and place orders, while administrators can manage products and users.

## Technologies Used
- Java
- Spring Boot
- PostgreSql
- Spring Data JPA
- Hibernate

##  Features
-User management (create, update, delete users)
- Product management (CRUD operations)
- Shopping cart functionality
- Order Processing
- Restful Api Design
- DataBase Persistence with JPA and Hibernate 

##  Screenshots
![Home](docs/home.png)

## Project Structure
- MVC Architecture
- Controller layer (REST endpoints)
- Service layer (business logic)
- Repository layer (Spring Data JPA)


##  Development Setup

1. Clone the repository:
git clone https://github.com/Belak17/shoppingcart

2. Open the project in IntelliJ IDEA or Eclipse

3. Configure the database in application.properties
   - spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
   - spring.datasource.username=your_username
   - spring.datasource.password=your_password
   - spring.jpa.hibernate.ddl-auto=update

5. Build the project using Maven

6. Run the application

7. Test APIs using Postman or any REST client

## How to tweak this project for your own uses 
Since this is a minimal system for the management of a library , I'd encourage you to clone this repository and 
rename it to user your onw boilerpate . Its a good starter for those who want to create an e-commerce application 
system 

## Contributions
Contributions are welcome!
1. Fork the repository
2. Create a new branch
3. Make your changes
4. Submit a pull request

## Find a bug 
If you found an issue or would like to submit an improvement to this project , please submit an issue  using the 
issues tab abaove . If you would like to submit a PR with a fix , reference the issues you corrected

## 👤 Author
- Kaleb AKAKPO
- LinkedIn Profile : https://www.linkedin.com/in/kaleb-akakpo-5a9431355/
