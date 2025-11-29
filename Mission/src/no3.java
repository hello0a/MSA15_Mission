import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        // 정수 1 ~ 100 출력하면서
        // 3, 6, 9 해당되면 포함개수만큼 "*" 출력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        
        for (int i = 1; i <= num; i++) {
            int ten = i / 10;
            int one = i % 10;
            int count = 0;

            if (ten == 3 || ten == 6 || ten == 9)
                count++;
            if (one == 3 || one == 6 || one == 9) 
                count++;
            
            if (count == 0) {
               System.out.println(i); 
            } else {
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
