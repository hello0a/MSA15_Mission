import java.util.ArrayList;
import java.util.Scanner;

public class no12 {
    public static void main(String[] args) {
        // 정수 N 입력받아 N개의 게임 로또 번호 출력하기
        // ArrayList 선언
        // 1~45 사이 랜덤 값(중복ㅌ)

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 게임? ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            ArrayList<Integer> lotto = new ArrayList<>();
            System.out.print("[" + i + " 게임] : ");

            for (int j = 0; j < 6; j++) {
                int num = (int) (Math.random() * 45) + 1;
                lotto.add(num);

                for (int z = 0; z < j; z++) {
                    if (lotto.get(j) == lotto.get(z)) {
                        lotto.remove(j);
                        j--;
                        break;
                    }
                }
            }
            for (int x = 0; x < lotto.size(); x++) {
                System.out.print(lotto.get(x) + " ");
            }
            System.out.println();
        }
    }
}
