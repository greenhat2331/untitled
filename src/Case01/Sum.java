package Case01;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 1) {
            sum += i;
        }
        System.out.println("和为："+sum);
    }
}
