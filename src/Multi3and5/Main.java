package Multi3and5;

public class Main {
    public static int solution(int number) {
        if (number <= 0) return 0;
        int answer = 0;
        for (int i = 1; i < number; i++){
            if (i % 3 == 0 || i % 5 == 0) {
                answer += i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
