# Bank Application

A console-based banking management system built in Java, demonstrating core Object-Oriented Programming principles, JDBC database connectivity, and layered application design.

## Features

- Create, view, update, and manage customer bank accounts
- Perform deposits, withdrawals, and balance inquiries
- Record and retrieve transaction history
- Validate account details before processing operations
- Persistent storage via JDBC-connected database

## Tech Stack

- **Language:** Java
- **Database:** JDBC (SQL-based persistence)
- **Architecture:** Layered design (DAO, Business Service, UI)

## Project Structure

BankApplication/
└── src/
├── Bank.java # Entry point / main class
├── BankUI.java # Console-based user interface
├── BankBusinessService.java # Business logic layer
├── AccountMasterDAO.java # Data access for account records
├── accountMaster.java # Account model/entity
├── TransactionDAO.java # Data access for transaction records
├── transaction.java # Transaction model/entity
├── AccountValidationAndDetails.java # Input validation logic
├── getConnection.java # Database connection handler
└── metaData.java # Metadata handling


## How to Run

1. Clone the repository:
```bash
   git clone https://github.com/SoftwareDeveloperYash/BankApplication.git
```
2. Open the project in IntelliJ IDEA (or your preferred Java IDE).
3. Configure your database connection details in `getConnection.java`.
4. Run `Bank.java` to start the application.

## What I Learned

Building this project helped me apply core Java and OOP concepts to a real-world use case — including class design, encapsulation, and separating concerns between data access, business logic, and UI layers.

## Author

**Yashwanth Bhukya**
[LinkedIn](https://www.linkedin.com/in/yashwanthbhukya) · [GitHub](https://github.com/SoftwareDeveloperYash)
