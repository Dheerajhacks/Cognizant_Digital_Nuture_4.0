import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nPayment Strategy Pattern Example\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payment amount:- ");
        double amount = sc.nextDouble();
        System.out.print("\nChoose payment method (1 for PayPal, 2 for Credit Card): ");
        int choice = sc.nextInt();
        System.out.println();

        PaymentStrategy strategy;
        PaymentContext context;
        

        if (choice == 1) 
            strategy = new PayPalPayment();
        else if (choice == 2) 
            strategy = new CreditCardPayment();
        else {
            System.out.println("Invalid choice. Exiting.");
            return;
        }
        
        context = new PaymentContext(strategy);
        context.pay(amount);
        System.out.println();

    }
}
