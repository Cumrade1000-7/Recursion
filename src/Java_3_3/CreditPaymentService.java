package Java_3_3;

public class CreditPaymentService {
    public int calculate (int amount, int period, double percent) {
        double monthPercent = percent / 12 / 100;
        int monthPeriod = period * 12;
        double coef = (monthPercent * Math.pow((1 + monthPercent), monthPeriod)) /
                (Math.pow((1 + monthPercent), monthPeriod) - 1);
        return (int) (coef * amount);
    }
}
