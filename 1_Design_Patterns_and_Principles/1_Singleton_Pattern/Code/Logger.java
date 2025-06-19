public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger constructor called");
    }

    public static Logger getInst(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

class Test{
    public static void main(String[] args) {

        System.out.println();

        Logger l1 = Logger.getInst();
        Logger l2 = Logger.getInst();
        Logger l3 = Logger.getInst();
        
        System.out.println("\nInstance l1: " + l1);
        System.out.println("Instance l2: " + l2);
        System.out.println("Instance l3: " + l3);

        System.out.println("\nAre all instances the same - " + (l1 == l2 && l2 == l3));
    }
}