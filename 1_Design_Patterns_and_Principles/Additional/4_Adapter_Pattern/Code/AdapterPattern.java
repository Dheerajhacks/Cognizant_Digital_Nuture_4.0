interface PaymentProcessor{
    void processPayment(double amount);
}

class Razorpay implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using Razorpay.");
    }
}

class Stripe implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using Stripe.");
    }
}

class phonePe implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using PhonePe.");
    }
}

class Adapter{
    PaymentProcessor processor;

    public Adapter(String paymentMethod) {
        switch (paymentMethod.toLowerCase()) {
            case "razorpay":
                processor = new Razorpay();
                break;
            case "stripe":
                processor = new Stripe();
                break;
            case "phonepe":
                processor = new phonePe();
                break;
            default:
                System.out.println("Unsupported payment method: " + paymentMethod);
        }
    }

    public void processPayment(double amount) {
        processor.processPayment(amount);
        System.out.println();
    }
}