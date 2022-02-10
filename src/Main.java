public class Main {
    public static void main(String[] args) {

        CreditPaymentService service1 = new CreditPaymentService();
        double creditPayment1 = service1.calculate(1_000_000, 9.99, 1);
        System.out.println("Ежемесячный платеж на 1 год составляет " + Math.round(creditPayment1) + " руб.");

        CreditPaymentService service2 = new CreditPaymentService();
        double creditPayment2 = service2.calculate(1_000_000, 9.99, 2);
        System.out.println("Ежемесячный платеж на 2 года составляет " + Math.round(creditPayment2) + " руб.");

        CreditPaymentService service3 = new CreditPaymentService();
        double creditPayment3 = service3.calculate(1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платеж на 3 года составляет " + Math.round(creditPayment3) + " руб.");
    }
}
