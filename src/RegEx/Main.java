package RegEx;

public class Main {

    public static boolean validatePin(String pin) {
        return pin.matches("(\\d{2})?(\\d{4})");
    }

    public static void main(String[] args) {
        System.out.println(validatePin("214444"));
    }
}
