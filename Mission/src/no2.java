import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        if (1 <= N && N <= 100) {
            for (int i = 1; i <= N; i+=2) {
                sum1 += i;
                System.out.print(i);
                if (i + 2 <= N) {
                    System.out.print("+");
                }
            }
            System.out.println("=" + sum1);
            for (int i = 2; i <= N; i+=2) {
                sum2 += i;
                System.out.print(i);
                if (i + 2 <= N) {
                    System.out.print("+");
                }
            }
            System.out.println("=" + sum2);
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
}
