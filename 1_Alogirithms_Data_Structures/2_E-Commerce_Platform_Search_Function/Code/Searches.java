import java.util.*;

class Product{
    int id;
    String name;
    String category;

    Product(int id, String name, String category){
        this.id = id;
        this.name = name;
        this.category = category;
    }
}

public class Searches{

    static boolean linear_search(Product[] products, int sid) {
        for (Product product : products) {
            if (product.id == sid) {
                return true;
            }
        }
        return false;
    }
    static boolean binary_search(Product[] products, int sid) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].id == sid) {
                return true;
            }
            if (products[mid].id < sid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Product Management System\n");
        System.out.println("Enter the number of products:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the products (id, name, category):");
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }
        System.out.println("\nProducts entered:");
        for (Product product : products) {
            System.out.println("ID: " + product.id + ", Name: " + product.name + ", Category: " + product.category);
        }
        System.out.println("\nEnter a search Product ID you want to search:");
        int sid = sc.nextInt();
        boolean found = false;
        System.out.println("Searching Using Linear Search...");

        found = linear_search(products, sid);
        System.out.println(found ? "Product found!" : "Product not found!");
        System.out.println("\nSearching Using Binary Search...");
        Arrays.sort(products, Comparator.comparingInt(p -> p.id));
        found = binary_search(products, sid);
        System.out.println(found ? "Product found!" : "Product not found!");
        sc.close();
    }
}