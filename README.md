Multi-User Bank System (V2.0) 🚀
This is an advanced version of my Banking System developed using Java. This project focuses on Object-Oriented Programming (OOP) principles and thread safety for multi-user environments.

🛠️ Key Features (What's New in V2)
Inheritance & Polymorphism: Implemented a parent Bank class with specialized Savingacc and Currentacc subclasses. [cite: 2025-12-30]

Method Overriding: Custom withdrawal logic for different account types (e.g., Overdraft limit for Current Accounts).

Thread Safety (Concurrency): Used the synchronized keyword to ensure data consistency when multiple users access the same account simultaneously. [cite: 2026-01-06]

Overdraft Support: Current accounts allow withdrawals beyond the balance up to a predefined limit.

📂 Project Structure
Bank.java: The base class containing common attributes like name, account number, and balance.

Savingacc.java: Handles savings logic with balance checks.

Currentacc.java: Handles business logic including overdraft and synchronized transactions.

NewMain.java: The entry point to test the system functionality.
