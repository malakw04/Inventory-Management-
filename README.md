# Inventory Management System 

## Overview
This is a **Java-based Inventory Management System** that allows users to:
- Add, update, remove, and search for products.
- Persist inventory data using **serialization (`inventory.dat`)**.
- Optimize search functionality for a smooth user experience.
- Utilize **Object-Oriented Programming (OOP)** principles for structured product management.

## Features
**Object-Oriented Design** – Uses a `Product` class to manage inventory records.  
**Data Persistence with Serialization** – Saves and loads inventory from `inventory.dat`.  
**Optimized Search** – Find products by **ID** or **name**.  
**User Input Validation** – Ensures valid data entry.  
**Console-Based Interface** – Simple command-line interaction.

## How It Works
1. **Run the program** (`Inventory.java`).
2. Choose an option from the menu:
   - **Add Product**: Enter ID, name, price, and quantity.
   - **Update Product**: Modify the quantity of an existing product.
   - **Remove Product**: Delete a product by its ID.
   - **Search Product**: Find a product by ID or name.
   - **Display Inventory**: View all products in the inventory.
   - **Exit**: Close the program.
3. The inventory is **automatically saved** in `inventory.dat` using **Java Object Serialization**.

## Data Persistence (`inventory.dat`)
- The inventory is stored in a **binary format** using **Java serialization**.
- The program automatically **loads saved data** at startup and **updates `inventory.dat`** on every change.
- Since it is a binary file, it cannot be read directly as plain text.

## Installation & Usage
### Prerequisites
- **Java 8+** installed

### Running the Project
1. **Compile the program:**
   ```
   javac Inventory.java
   ```
2. **Run the program:**
   ```
   java Inventory




