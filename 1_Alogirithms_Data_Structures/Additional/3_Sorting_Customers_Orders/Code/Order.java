public class Order {
    int orderId;
    String customerName;
    float totalPrice;

    public Order(int orderId, String customerName, float totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    static void bubble(Order[] orders) {
        for (int i = 0; i < orders.length - 1; i++) {
            for (int j = 0; j < orders.length - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order swap = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = swap;
                }
            }
        }
    }

    static void quickSort(Order[] orders, int low, int high) {
        if(low < high){
            Order pivot = orders[low];
            int i = low, j = high;
            while(i < j) {
                while(i < high && orders[i].totalPrice <= pivot.totalPrice) i++;
                while(j > low && orders[j].totalPrice > pivot.totalPrice) j--;
                if(i < j) {
                    Order temp = orders[i];
                    orders[i] = orders[j];
                    orders[j] = temp;
                }
            }
            orders[low] = orders[j];
            orders[j] = pivot;
            quickSort(orders, low, j - 1);
            quickSort(orders, j + 1, high);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("\nSorting customer orders\n");

        Order[] orders = {
            new Order(101, "Alice", 250.0f),
            new Order(102, "Bob", 150.0f),
            new Order(103, "Charlie",  300.0f),
            new Order(101, "Denver", 850.0f),
            new Order(102, "Eliza", 50.0f),
            new Order(103, "Faiz",  300.0f)
        };

        System.out.println("Unsorted Orders:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId + ", Customer: " + order.customerName + ", Total Price: " + order.totalPrice);
        }

        System.out.println("\nSorting by bubble sort...\n");
        bubble(orders);
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId + ", Customer: " + order.customerName + ", Total Price: " + order.totalPrice);
        }
        
        System.out.println("\nSorting by quick sort...\n");
        Order[] temp = orders;
        quickSort(temp, 0, temp.length - 1);
        for (Order order : temp) {
            System.out.println("Order ID: " + order.orderId + ", Customer: " + order.customerName + ", Total Price: " + order.totalPrice);
        }
        System.out.println();


    }
}
