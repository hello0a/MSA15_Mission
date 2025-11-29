import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        // 화폐매수를 구하는 프로그램
        // 고액권 우선 지급, 나머지 금액은 그 다음 단위의 화폐 순서로 지급
        // 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
        // 입력 : 성명, 간식비 지급액
        // QUIT -> 입력 끝
        // 출력: 성명, 간식비 지급액, 개인별 각 화폐 매수, 전체 화폐 매수

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int price = sc.nextInt();
        sc.nextLine();

        int money = 50000;
        boolean result = true;
        int count = 0;

        System.out.println("성명 " + "출장비   " + "오만원 " + "만원 " + "오천원 " + "천원 " + "오백원 " + "백원 " + "오십원 " + "십원 " + "오원 " + "일원 ");
        do {

            System.out.print(name + " " + price + " ");

            while (price >= 1) {
                count = price / money;
                System.out.print("   "+ count);

                price = price % money;
                if (result) {
                    money = money / 5;
                } else {
                    money = money / 2;
                }
                result = !result;
            }
        } while(name == "QUIT");

        System.out.println("전체 화폐매수 : " );
        sc.close();
    }
}
