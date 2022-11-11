package Java_2_1;

public class Main {
    public static void main(String[] args) {
        int totalAmount = 100;
        int payAmount = 1100;
        int bonusAmount = 0;
        totalAmount += payAmount;
        if (payAmount > 1000) {
            bonusAmount = payAmount / 100;
            totalAmount += bonusAmount;
        }
        System.out.println("Итоговый счет: " + totalAmount + " руб.");
        System.out.println("Бонусные рубли: " + bonusAmount + " руб.");
    }
}
