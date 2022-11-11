package Java_3_3;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        int var1 = creditPaymentService.calculate(1_000_000, 1, 9.99);
        int var2 = creditPaymentService.calculate(1_000_000, 2, 9.99);
        int var3 = creditPaymentService.calculate(1_000_000, 3, 9.99);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }
}
