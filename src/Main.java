import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int century(int number) {
        StringBuilder sb = new StringBuilder();
        if (number <= 100){
            return 1;
        }
        String temp = String.valueOf(number);
        List<String> nums = new ArrayList<>();
        for (int i = 0; i < temp.length(); i++) {
            nums.add(String.valueOf(temp.charAt(i)));
        }
        if (nums.get(nums.size() - 1).equals("0")) {
            if (isCentury(nums)) {
                for (int i = 0; i < nums.size() - 2; i++) {
                    sb.append(nums.get(i));
                }
                return Integer.parseInt(String.valueOf(sb));
            } else {
                for (int i = 0; i < nums.size() - 2; i++) {
                    sb.append(nums.get(i));
                }
                return Integer.parseInt(String.valueOf(sb)) + 1;
            }
        } else {
            for (int i = 0; i < nums.size() - 2; i++) {
                sb.append(nums.get(i));
            }
            return Integer.parseInt(String.valueOf(sb)) + 1;
        }
    }
    public static boolean isCentury (List<String> nums){
        for (int i = nums.size() - 1; i > nums.size() - 3; i--) {
            if (!(nums.get(i).equals("0"))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(century(1900));
    }
}
