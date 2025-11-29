import java.util.Scanner;

public class no5 {
    static void print () {
        System.out.println("********** 치킨 메뉴판 **********");
        System.out.println("1. 황금올리브 반반한 치킨");
        System.out.println("2. 뿌잉클 치킨");
        System.out.println("3. 처갓집에서 호식이가 만든 치킨");
        System.out.println("0. 종료");
        System.out.print("********** 번호 : ");
    }
    public static void main(String[] args) {
        // 치킨 메뉴판 출력
        // 입력 : 메뉴번호
        // 조건 : do while / switch / static
        // 정수 1 ~3 입력 -> 해당 메뉴 이름과 주문 안내 문구 출력
        // 정수 0 ~3 이외 입력 -> 0 ~ 3 사이 번호 입력 요청 안내문구 출력
        // 정수 0 입력 -> 주문한 메뉴 개수와 주문완료 메시지 출력
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int count = 0;

        do {
            print();
            num = sc.nextInt();
            System.out.println();

            switch (num) {
                case 1: System.out.println("'황금올리브 반반한 치킨'이(/가) 주문되었습니다.");
                    count++;
                    break;
                case 2: System.out.println("'뿌잉클 치킨'이(/가) 주문되었습니다.");
                    count++;
                    break;
                case 3: System.out.println("'처갓집에서 호식이가 만든 치킨'이(/가) 주문되었습니다.");
                    count++;
                    break;
                case 0: System.out.println("총 " + count + " 개의 상품이 주문되었습니다.");
                    break;
                default:
                    System.out.println("(0~3) 사이의 번호를 입력해주세요.");
            }
            System.out.println();
        } while (num != 0);

        // System.out.println("총 " + count + " 개의 상품이 주문되었습니다.");
    }
}
