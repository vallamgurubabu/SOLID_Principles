# SOLID Principles in Java

This project demonstrates the five SOLID design principles using simple Java examples. Each principle is implemented with easy-to-understand code to show how to apply these best practices in real-world software development.

---

## 🔸 1. Single Responsibility Principle (SRP)

**Definition**: A class should have only one reason to change.

**Example**:
- `Invoice`: Manages invoice data.
- `InvoicePrinter`: Handles printing logic.
- `InvoiceSaver`: Handles saving logic.

✅ Each class is focused on one task only.

---

## 🔸 2. Open/Closed Principle (OCP)

**Definition**: Software entities should be open for extension but closed for modification.

**Example**:
- Interface: `Discount`
- Implementations: `NoDiscount`, `FestiveDiscount`

✅ You can add new discount types without modifying existing code.

---

## 🔸 3. Liskov Substitution Principle (LSP)

**Definition**: Subtypes must be substitutable for their base types.

**Example**:
- `Sparrow extends Bird` is fine.
- `Ostrich` doesn't override `fly()` and uses a different base (`BaseBird`) to follow the principle.

✅ Substitution won't break functionality.

---

## 🔸 4. Interface Segregation Principle (ISP)

**Definition**: Clients should not be forced to implement interfaces they don't use.

**Example**:
- Interfaces: `Workable`, `Eatable`
- `Human` implements both.
- `Robot` only implements `Workable`.

✅ Avoids unnecessary method implementations.

---

## 🔸 5. Dependency Inversion Principle (DIP)

**Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions.

**Example**:
- Interface: `Database`
- Implementation: `MySQLDatabase`
- `DataAccess` depends on `Database`, not a specific database class.

✅ Easily switch databases with minimal code changes.

---

## 📁 How to Run

1. Clone this repo.
2. Compile and run the `SolidPrinciplesDemo.java` file.
3. Observe output demonstrating each principle in action.

---

## 🧠 Why SOLID Matters

Following SOLID principles improves:

- Code readability  
- Maintainability  
- Testability  
- Extensibility  

---

## 👨‍💻 Author

Created by a Vallam Guru Babu Java Full Stack Developer passionate about clean code and system design.

> Feel free to contribute, star ⭐ the repo, or fork it!
