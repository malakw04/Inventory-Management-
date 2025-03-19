

	import java.io.*;
	import java.util.*;

	class Product implements Serializable {
	    private static final long serialVersionUID = 1L;
	    private int id;
	    private String name;
	    private double price;
	    private int quantity;

	    public Product(int id, String name, double price, int quantity) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public int getId() { return id; }
	    public String getName() { return name; }
	    public double getPrice() { return price; }
	    public int getQuantity() { return quantity; }
	    public void setQuantity(int quantity) { this.quantity = quantity; }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
	    }
	}

	class InventoryManager {
	    private List<Product> inventory = new ArrayList<>();
	    private final String FILE_NAME = "inventory.dat";

	    public InventoryManager() {
	        loadInventory();
	    }

	    public void addProduct(int id, String name, double price, int quantity) {
	        inventory.add(new Product(id, name, price, quantity));
	        saveInventory();
	    }

	    public void updateProduct(int id, int newQuantity) {
	        for (Product p : inventory) {
	            if (p.getId() == id) {
	                p.setQuantity(newQuantity);
	                saveInventory();
	                return;
	            }
	        }
	        System.out.println("Product not found.");
	    }

	    public void removeProduct(int id) {
	        inventory.removeIf(p -> p.getId() == id);
	        saveInventory();
	    }

	    public Product searchProduct(String keyword) {
	        for (Product p : inventory) {
	            if (p.getName().equalsIgnoreCase(keyword) || Integer.toString(p.getId()).equals(keyword)) {
	                return p;
	            }
	        }
	        return null;
	    }

	    public void displayInventory() {
	        if (inventory.isEmpty()) {
	            System.out.println("Inventory is empty.");
	        } else {
	            inventory.forEach(System.out::println);
	        }
	    }

	    private void saveInventory() {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
	            oos.writeObject(inventory);
	        } catch (IOException e) {
	            System.out.println("Error saving inventory.");
	        }
	    }

	    private void loadInventory() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
	            inventory = (List<Product>) ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            inventory = new ArrayList<>();
	        }
	    }
	}

	public class Inventory {
	    public static void main(String[] args) {
	        InventoryManager manager = new InventoryManager();
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("\n1. Add Product  2. Update Product  3. Remove Product  4. Search  5. Display  6. Exit");
	            System.out.print("Enter choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Price: ");
	                    double price = scanner.nextDouble();
	                    System.out.print("Enter Quantity: ");
	                    int quantity = scanner.nextInt();
	                    manager.addProduct(id, name, price, quantity);
	                    break;
	                case 2:
	                    System.out.print("Enter Product ID to update: ");
	                    int updateId = scanner.nextInt();
	                    System.out.print("Enter New Quantity: ");
	                    int newQuantity = scanner.nextInt();
	                    manager.updateProduct(updateId, newQuantity);
	                    break;
	                case 3:
	                    System.out.print("Enter Product ID to remove: ");
	                    int removeId = scanner.nextInt();
	                    manager.removeProduct(removeId);
	                    break;
	                case 4:
	                    System.out.print("Enter Product ID or Name to search: ");
	                    String keyword = scanner.nextLine();
	                    Product found = manager.searchProduct(keyword);
	                    System.out.println(found != null ? found : "Product not found.");
	                    break;
	                case 5:
	                    manager.displayInventory();
	                    break;
	                case 6:
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	}



