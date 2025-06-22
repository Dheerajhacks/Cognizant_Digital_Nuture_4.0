import java.util.Scanner;

public class App {

    static float calculate(float cost, float rate, int yrs) {
        
        if(yrs == 0)
        return cost;

        float res = cost + (cost*rate)/100;
        System.out.println(res);
        return calculate(res, rate, yrs-1); 
    }
    public static void main(String[] args) throws Exception {
        System.out.println("\nFinancial Forecasting Prediction Model\n");
        System.out.println("Enter the required details (Initial investment, Interest rate, and No of years):\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Initial Investment: ");
        float cost = sc.nextFloat();
        System.out.print("\nInterest Rate (in %): ");
        float rate = sc.nextFloat();
        System.out.print("\nNumber of Years: "); 
        int yrs = sc.nextInt();

        float val = calculate(cost, rate, yrs);
        System.out.println("Calculating by recursion...\n");
        System.out.printf("\nThe value of the investment after %d years is: %.4f\n\n", yrs, val);

        System.out.println("\nCalculating by iteration...\n");
        float res = cost;
        for(int i = 0; i < yrs; i++) {
            res += (res * rate) / 100;
        }
        System.out.printf("The value of the investment after %d years is: %.4f\n\n", yrs, res);
    }
}
