// Inventory Management System in Java
// Optimized version

import java.util.*;

public class IMSystem {
    Map<Integer, Product> products = new HashMap<>();

    void addProd(Product p) {
        products.put(p.id, p);
        System.out.println("Product added: " + p.name + " Successfully..!!");
    }

    void deleteProd(int id) {
        if (products.containsKey(id)) {
            products.remove(id);
            System.out.println("Product with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    void updateProd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product ID u want to update: ");
        int id = sc.nextInt();

        if(products.containsKey(id)){
            System.out.println("What do you want to update?\n1.Name\n2.Quantity\3.Price\n4.Exit");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter new name:");
                    products.get(id).name = sc.nextLine();
                    System.out.println("Product name updated to: " + products.get(id).name + " Successfully..!!");
                    break;
                case 2:
                    System.out.println("Enter new Quantity:");
                    products.get(id).quantity = sc.nextInt();
                    System.out.println("Product name updated to: " + products.get(id).quantity + " Successfully..!!");
                    break;
                case 3:
                    System.out.println("Enter new Price:");
                    products.get(id).price = sc.nextFloat();
                    System.out.println("Product name updated to: " + products.get(id).price + " Successfully..!!");
                    break;
                case 4:
                    System.out.println("Exiting update menu....");
                    break;
                default:
                    System.out.println("Invalid choice..!!\n");
                    break;
            }
        }
        else{
            System.out.println("Product with ID " + id + " does not exist..!! Please try again.");
        }
        sc.close();
    }

    void displayProd() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory yet...");
        } else {
            System.out.println("Products in Inventory:");
            for (Product p : products.values()) {
                System.out.println("ID: " + p.id + ", Name: " + p.name + ", Quantity: " + p.quantity + ", Price: $" + p.price);
            }
        }
    }

    public static void main(String[] args) {
        IMSystem inventory = new IMSystem();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\nWelcome to Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();sc.nextLine();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Product Price: ");
                    float price = sc.nextFloat();
                    inventory.addProd(new Product(id, name, quantity, price));
                    break;
                case 2:
                    inventory.updateProd();
                    break;
                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    int dId = sc.nextInt();
                    inventory.deleteProd(dId);
                    break;
                case 4:
                    inventory.displayProd();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (ch != 5);
        sc.close();
    }
}
