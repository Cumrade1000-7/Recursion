package Java_3_2;

public class Main {
    public static void main(String[] args) {
        double growth = 1.77;
        int weight = 74;
        BmiService bmiService = new BmiService();
        int bmi = bmiService.calculate(growth, weight);
        System.out.println(bmi);
    }
}
