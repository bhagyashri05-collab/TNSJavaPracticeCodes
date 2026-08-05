# Assignment 02 - Final Keyword in Java

## 📌 Objective

To demonstrate the use of the **final** keyword in Java by creating a `Transaction` class with a **final variable** and a **final method**. This assignment shows how the `final` keyword helps maintain data integrity and prevents modification of important program components.

---

## 📚 Concepts Covered

- Final Variable
- Final Method
- Object-Oriented Programming (OOP)
- Data Integrity
- Java Classes and Objects

---

## 📁 Project Structure

```
Assignment-02-Final-Keyword
│
├── src
│   └── finalassignment
│       ├── Transaction.java
│       └── Main.java
│
├── README.md
├── .project
└── .classpath
```

---

## 📄 Class Description

### Transaction.java

- Declares a **final variable** `transactionFee` with a fixed value.
- Implements a **final method** `performTransaction()` to process transactions.
- Ensures that the transaction fee and transaction process cannot be modified.

### Main.java

- Creates an object of the `Transaction` class.
- Calls the `performTransaction()` method with different transaction amounts.

---

## ▶️ Output

```
Transaction Amount : 500.0
Transaction Fee    : 20.0
Total Deducted     : 520.0

Transaction Amount : 1000.0
Transaction Fee    : 20.0
Total Deducted     : 1020.0
```

---

## ✨ Key Features

- Uses a **final variable** to keep the transaction fee constant.
- Uses a **final method** to prevent method overriding.
- Demonstrates the importance of the `final` keyword in maintaining program consistency and security.

---

## 🛠️ Technologies Used

- Java
- Eclipse IDE
- JDK 8 or above

---

## 🎯 Learning Outcome

After completing this assignment, I gained practical knowledge of:

- Using `final` variables
- Using `final` methods
- Preventing modification of critical data
- Applying Object-Oriented Programming concepts in Java

---

## 👩‍💻 Author

**Bhagyashri Wale**
