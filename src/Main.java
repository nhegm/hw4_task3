public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1000000F;       // money to loan
        double percentage = 9.99F;      // interest rate
        int term1 = 1;                   // credit term (years)
        int term2 = 2;                   // credit term (years)
        int term3 = 3;                   // credit term (years)
        double credit1year = service.calculate(amount, percentage, term1);
        double credit2years = service.calculate(amount, percentage, term2);
        double credit3years = service.calculate(amount, percentage, term3);
        int result1 = (int) credit1year;
        int result2 = (int) credit2years;
        int result3 = (int) credit3years;
        System.out.println("Ежемесячный размер платежа по кредиту: " + result1);
        System.out.println("Ежемесячный размер платежа по кредиту: " + result2);
        System.out.println("Ежемесячный размер платежа по кредиту: " + result3);
    }
}