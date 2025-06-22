import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        System.out.println("\nAdapter Pattern\n");
        System.out.println("Choose a payment method: \n1. Razorpay \n2. Stripe \n3. PhonePe\n");
        int ch;
        Scanner sc = new Scanner(System.in);

        Adapter a;
        System.out.print("Enter your choice(1/2/3):- ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                a = new Adapter("Razorpay");
                break;
            case 2:
                a = new Adapter("Stripe");
                break;
            case 3:
                a = new Adapter("PhonePe");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid payment method.");
                return;
        }
        System.out.print("Enter the amount to be paid:- ");
        double amount = sc.nextDouble();
        a.processPayment(amount);
    }
}
