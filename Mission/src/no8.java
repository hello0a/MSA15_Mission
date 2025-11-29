import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        // 정수 N 입력받아
        // N행 N열의 2채원 배열 선언하시오.
        // 배열요소 1부터 1씩 증가하는 값을 순서대로 저장
        // 1행 증가할 때마다 배열요소에 접근하는 방향 반대로
        // 3 -> [][][] / [][][] / [][][]

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        int num = 1;
        for (int i = 0; i < N; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = num++;
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
