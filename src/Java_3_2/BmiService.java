package Java_3_2;

public class BmiService {
    public int calculate (double growth, int weight) {
        return weight / (int) (growth * growth);
    }
}
