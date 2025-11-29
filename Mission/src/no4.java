import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        // 정수 하나 입력 받아 정수형 변수 N 초기화시키고
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 예시 : 5
        //    *  : N-1 / N
        //   *** : N-2 / N + 2
        //  ***** 트리..??
        for (int i = 1; i <= N; i++) {
            int count = 2 * i - 1;
            for (int j = 1; j < N - i + 1; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= count; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
