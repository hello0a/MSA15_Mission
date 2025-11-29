import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int eng, math, java;
        eng = sc.nextInt();
        math = sc.nextInt();
        java = sc.nextInt();
        System.out.println("영어 점수 : " + eng);
        System.out.println("수학 점수 : " + math);
        System.out.println("자바 점수 : " + java);

        int sum = eng + math + java;
        System.out.println("총점 : " + sum);

        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);
        sc.close();
    }
}
