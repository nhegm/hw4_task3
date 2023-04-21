public class CreditPaymentService {
    public double calculate(double amount, double percentage, int term) {
        int months = term * 12;
        double intRate = percentage / (100 * 12);
        double result = amount * intRate / (1 - Math.pow(1 + intRate, -months));
        return result;
    }
}
