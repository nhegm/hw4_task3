public class CreditPaymentService {
    public double calculate(double a, double p, int y) {
        int m = y * 12;
        double intRate = p / (100 * 12);
        double result = a * intRate / (1 - Math.pow(1 + intRate, -m));
        return result;
    }
}
