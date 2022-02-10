public class CreditPaymentService {
    public double calculate(int amount, double percent, int year){
        double montlyRate = percent / 12 / 100; // ежемесячная процентная ставка
        int months = year * 12; // количество платежей
        double creditPayment = amount * (montlyRate + montlyRate / (Math.pow(1 + montlyRate, months) - 1));

        return creditPayment;
    }
}
