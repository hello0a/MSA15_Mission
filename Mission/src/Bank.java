import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Account acount = new Account();
        Scanner sc = new Scanner(System.in);

        int acountCount = 0;
        int num = 0;
        int password = 0;
        int input = 0;
        int answer = 0;
        int deposit;
        int withdraw;
        int managerPassword;
        String inputNumber;


        do {

            System.out.println("==============================");
            System.out.println("1. 계좌등록");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 계좌조회");
            System.out.println("5. 계좌목록");
            System.out.println("6. 종료");
            System.out.println("==============================");
            System.out.print("입력>> ");
            num = sc.nextInt();

//            System.out.println();
            switch (num) {
                case 1:
                    System.out.print("계좌번호>> ");
                    acount.setAccountNumber(sc.next());
                    System.out.print("예금주>> ");
                    acount.setName(sc.next());
                    System.out.print("최초예금액>> ");
                    acount.setBalance(sc.nextInt());
                    System.out.print("비밀번호>> ");
                    password = sc.nextInt();
                    acountCount++;
                    if (acountCount > 1000) {
                        break;
                    }
                    System.out.println("'" + acount.getName() + "'" + "님의 계좌가 개설되었습니다.");
                    break;

                case 2:
                    System.out.println("========== 입금 ==========");
                    System.out.print("계좌번호>> " );
                    inputNumber = sc.next();
                    System.out.print("입금액>> ");
                    deposit = sc.nextInt();

                    System.out.println("'" + acount.getName() + "'" + "님에게 입금하는게 맞으십니까?");
                    System.out.println("1. 예");
                    System.out.println("2. 아니오");
                    System.out.print("입력>> ");
                    answer = sc.nextInt();

                    if (answer == 1) {
                        System.out.println("'" + acount.getName() + "'" + "님의 계좌에 " + deposit + " 원이 입금되었습니다.");
                        acount.balance += deposit;
                    } break;

                case  3:
                    System.out.println("========== 출금 ==========");
                    System.out.print("계좌번호>> " );
                    inputNumber = sc.next();
                    System.out.print("비밀번호>> ");
                    input = sc.nextInt();

                    if (input != password) {
                        System.out.println("비밀번호가 다릅니다!");
                        break;
                    } else {
                        System.out.print("출금액>> ");
                        withdraw = sc.nextInt();
                        System.out.println("'" + acount.getName() + "'님의 계좌에 " + withdraw + "원이 출금되었습니다");
                        acount.balance -= withdraw;
                    } break;

                case  4:
                    System.out.println("========== 계좌조회 ==========");
                    System.out.print("계좌번호>> " );
                    inputNumber = sc.next();
                    System.out.print("비밀번호>> ");
                    input = sc.nextInt();
                    System.out.println("'" + acount.getName() + "'님의 계좌잔액은 " + acount.getBalance() + " 원 입니다.");
                    break;
                case 5:
                    System.out.print("관리자 비밀번호>> ");
                    managerPassword = sc.nextInt();
                    if (managerPassword == 1111) {
                        System.out.println("========== 계좌목록 ==========");
                        System.out.println("예금주           계좌번호            잔고") ;
                        System.out.println(acount.getName() + "            " + acount.getAccountNumber() + "           " + acount.getBalance());
                    }
                    break;
                case 6:
                    System.out.println("시스템을 종료합니다.");
                    break;
            }
        } while (num != 6);
    }
}
