public class Test {
    public static void main(String[] args) {

        System.out.println("\nObserver Pattern Test\n");

        StockMarket stockMarket = new StockMarket();
        
        WebApp w1 = new WebApp("WEBAPP_1");
        MobileApp m1 = new MobileApp("MOBILEAPP_1");
        
        System.out.println("\nRegistering observers...");
        stockMarket.register(w1);
        stockMarket.register(m1);
        
        System.out.println("\nNotifying observers...");
        stockMarket.notifying(); 
        
        System.out.println("\nDeregistering observer... ");
        stockMarket.deregister(w1);
        
        System.out.println("\nNotifying observers...");
        stockMarket.notifying(); 
        System.out.println();
    }
}