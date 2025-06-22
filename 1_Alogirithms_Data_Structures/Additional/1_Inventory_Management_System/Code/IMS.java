// Inventory Management System (IMS) in Java
// General methods

import java.util.*;

public class IMS {

    List<Product> products = new ArrayList<>();

    void addProd(Product p) {
        products.add(p);
        System.out.println("Product added: " + p.name);
    }

    void displayProd(){
        System.out.println("Products in Inventory:");
        for (Product p : products) {
            System.out.println("ID: " + p.id + ", Name: " + p.name + ", Quantity: " + p.quantity + ", Price: $" + p.price);
        }
    }

    void updateProd(int id){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do u want to update\n1. Name\n2. Quantity\n3. Price");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter new name:");
                String name_ = sc.next();
                for (Product p : products) {
                    if (p.id == id) {
                        p.name = name_;
                        System.out.println("Product name updated to: " + name_);
                    }
                }
                break;
            case 2:
                System.out.println("Enter new quantity:");
                int quantity_ = sc.nextInt();
                for (Product p : products) {
                    if (p.id == id) {
                        p.quantity = quantity_;
                        System.out.println("Product quantity updated to: " + quantity_);
                    }
                }
                break;
            case 3:
                System.out.println("Enter new price:");
                float price_ = sc.nextFloat();
                for (Product p : products) {
                    if (p.id == id) {
                        p.price = price_;
                        System.out.println("Product price updated to: $" + price_);
                    }
                }
                break;
            default:
                System.out.println("Invalid choice..!!\n");
                break;
        }
        sc.close();
    }
    public static void main(String[] args) {
        IMS inventory = new IMS();

        inventory.addProd(new Product(1, "Laptop", 10, 60000));
        inventory.addProd(new Product(2, "Smartphone", 20, 14999.99f));
        inventory.addProd(new Product(3, "Tablet", 15, 4999.99f));

        inventory.displayProd();
        inventory.products.get(0).quantity = 5;
        inventory.updateProd(1);
    }
}
