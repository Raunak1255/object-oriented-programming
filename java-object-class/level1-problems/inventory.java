import java.util.Scanner;

class Item {
    // Attributes
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method
    public static void main(String[] args) {
        // Creating an Item object
        Item item1 = new Item(101, "Wireless Mouse", 25.50);
        
        // Displaying the item details
        item1.displayDetails();
        
        // Taking user input for quantity
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity to purchase: ");
        int quantity = scanner.nextInt();
        
        // Calculating and displaying total cost
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: $" + totalCost);
        
        scanner.close();
    }
}
