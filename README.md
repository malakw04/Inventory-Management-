# Inventory Management System 

## Overview
This is a **Java-based Inventory Management System** that allows users to:
- Add, update, remove, and search for products.
- Persist inventory data using a **text file (`inventory.txt`)**.
- Optimize search functionality for a smooth user experience.
- Utilize **Object-Oriented Programming (OOP)** principles for structured product management.

## Features
**Object-Oriented Design** – Uses a `Product` class to manage inventory records.  
**File-Based Data Persistence** – Reads from and writes to `inventory.txt`.  
**Optimized Search** – Find products by **ID** or **name**.  
**User Input Validation** – Ensures valid data entry.  
**Console-Based Interface** – Simple command-line interaction.

## How It Works
1. **Run the program** (`InventoryApp.java`).
2. Choose an option from the menu:
   - **Add Product**: Enter ID, name, price, and quantity.
   - **Update Product**: Modify the quantity of an existing product.
   - **Remove Product**: Delete a product by its ID.
   - **Search Product**: Find a product by ID or name.
   - **Display Inventory**: View all products in the inventory.
   - **Exit**: Close the program.
3. The inventory is **automatically saved** in `inventory.txt`.

## File Format (`inventory.txt`)
Products are stored in CSV format:
```
101,Laptop,999.99,5
102,Mouse,19.99,20
103,Keyboard,49.99,10
```
Each line represents a product with **ID, Name, Price, Quantity**.

## Installation & Usage
### Prerequisites
- **Java 8+** installed

### Running the Project
1. **Compile the program:**
   ```bash
   javac InventoryApp.java
   ```
2. **Run the program:**
   ```bash
   java InventoryApp
   ```


