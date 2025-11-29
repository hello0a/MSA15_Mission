import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        // 정수 N 입력받아 N개의 게임 로또 번호 출력
        // 1차원 배열 : 6개 배열 요소
        // 		저장 : 1~45 사이 랜덤 값 (중복x)
        // 		출력 : N번 반복
        // Math.random() 메서드 : 0.0 이상 1.0 미만 임의의 값 반환
        // Random random = new Random();
        // random.nextInt(N);
        // : 0이상 N이하의 임의의 정수 타입 값 반환
        // (int) (Math.random() * 45) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 게임? ");
        int N = sc.nextInt();
        int[] lotto = new int[6];

        for (int i = 1; i <= N; i++) {
                System.out.print("[" + i + " 게임] : ");
            for (int j = 0; j < lotto.length; j++) {
                lotto[j] = (int) (Math.random() * 45) + 1;
                for (int z = 0; z <= j-1; z++) {
                    if (lotto[j] == lotto[z]) {
                        j--;
                        break;
                    }
                }
                System.out.print(lotto[j] + " ");
            }
            System.out.println();
        }
    }
}
