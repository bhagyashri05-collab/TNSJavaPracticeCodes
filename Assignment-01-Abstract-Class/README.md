# Java Abstract Class Assignment

## Overview

This project demonstrates the concept of **Abstraction** in Java using an abstract class and method overriding.

An abstract class `Account` is created to define common banking operations, while `SavingAccount` and `CheckingAccount` provide their own implementations for deposit, withdrawal, and balance retrieval.

## Concepts Covered

- Abstract Class
- Abstract Methods
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Object-Oriented Programming (OOP)

## Project Structure

```
Abstract_Assignment
│
├── src
│   └── abstractassign
│       ├── Account.java
│       ├── SavingAccount.java
│       ├── CheckingAccount.java
│       ├── Main.java
│
├── .project
└── .classpath
```

## Class Description

### Account.java
- Abstract class
- Contains:
  - `deposit()`
  - `withdraw()`
  - `getBalance()`
- Includes a concrete method `welcomeMessage()`.

### SavingAccount.java
- Extends the `Account` class.
- Implements deposit, withdrawal, and balance retrieval for a savings account.

### CheckingAccount.java
- Extends the `Account` class.
- Implements deposit, withdrawal, and balance retrieval for a checking account.

### Main.java
- Creates objects of `SavingAccount` and `CheckingAccount`.
- Demonstrates abstraction through method implementation.

## Output

```
Welcome to Bank

Deposited: 500.0
Withdrawn: 300.0
Saving Account Balance = 1200.0

Deposited: 700.0
Withdrawn: 1000.0
Checking Account Balance = 1700.0
```

## Key Features

- Uses an abstract class to define common behavior.
- Demonstrates inheritance by extending the `Account` class.
- Uses method overriding to provide different implementations.
- Promotes code reusability and maintainability.

## Technologies Used

- Java
- Eclipse IDE
- JDK 8

## Learning Outcome

After completing this project, I gained hands-on experience with:
- Abstraction in Java
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Writing modular and reusable Java programs

## Author

**Bhagyashri Wale**
