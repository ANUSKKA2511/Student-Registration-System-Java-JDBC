# Student-Registration-System-Java-JDBC
Java console application using JDBC and MySQL
# Student Registration System (Java + JDBC)

## 📌 Project Description
This is a simple Java console application that allows users to enter student details such as name, roll number, and department, and stores the data into a MySQL database using JDBC.

This project demonstrates the basics of Java Database Connectivity (JDBC) including driver loading, database connection, prepared statements, and secure data insertion.

---

## 🛠 Technologies Used
- Java
- JDBC
- MySQL
- Eclipse IDE

---

## 📂 Database Structure

```sql
CREATE TABLE students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50),
  roll INT,
  dept VARCHAR(50)
);

📦 Project is uploaded as a ZIP archive. Extract before importing into Eclipse.
