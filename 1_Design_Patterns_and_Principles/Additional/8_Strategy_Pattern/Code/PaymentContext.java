public class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    void pay(double amount) {
        strategy.pay(amount);
    }
}
