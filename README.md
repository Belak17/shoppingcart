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

## 📸 Screenshots

### Login
<img width="1425" height="1020" alt="login" src="https://github.com/user-attachments/assets/3281a15a-15b1-4282-9e4b-a51ef308bf2a" />

---

### Get user by id
<img width="1432" height="1010" alt="getuserbyid" src="https://github.com/user-attachments/assets/e9ea0222-75bf-4aef-8302-eb7f928944da" />

---

### Place Order
<img width="1424" height="1006" alt="placeorder" src="https://github.com/user-attachments/assets/085adbe5-5eea-41bb-a4e9-f9e808b5114e" />


---

### Get order
<img width="1431" height="1014" alt="getorder" src="https://github.com/user-attachments/assets/783cffff-e0e1-4d67-bd84-5a869f6dc206" />


---

### Get all products
<img width="1425" height="1028" alt="getallproducts" src="https://github.com/user-attachments/assets/b1833011-2e14-4de7-825d-58cfd39eeaa0" />

---

### Add new products
<img width="1420" height="1008" alt="addnewproduct" src="https://github.com/user-attachments/assets/52cf7870-9cb3-4de1-b8a7-b2e3f9d3344a" />

---

### Update Item Quantity
<img width="1408" height="997" alt="updateitemquantiylogin" src="https://github.com/user-attachments/assets/90f86f4f-02f3-4505-80b8-74269695c655" />

---

### Update Item quantity without login 
<img width="1431" height="1015" alt="updateitemquantity" src="https://github.com/user-attachments/assets/eeeda8d8-8fc5-4c63-8bef-dfc77e1484bf" />





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
