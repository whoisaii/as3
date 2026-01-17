Assignment 3
Description:
This project is a simple Java console application for an e-commerce system.
It continues the previous work and uses PostgreSQL as a database.
The project demonstrates basic work with tables and database operations.

Technologies:
Java 17
PostgreSQL
JDBC

Database Structure:
Products table
The project uses one main table:
CREATE TABLE products (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    price DOUBLE PRECISION
);
This table stores information about products: id, name and price.

Project Functionality:
The program can:
show all products
search product by name
filter products by price
sort products by price
add products to database
read products from database
update product price
delete product from database
All results are shown in the console.

How to Run:
Install PostgreSQL.
Create a database.
Create the products table.
Add PostgreSQL JDBC driver to the project.
Open the project in IntelliJ IDEA.
Run Main.java.

Result:
After running the program:
products are printed in console
database operations (read, update, delete) are executed
updated list of products is shown from database

Conclusion:
This project helped me understand how Java works with databases using JDBC and how to perform basic CRUD operations.
