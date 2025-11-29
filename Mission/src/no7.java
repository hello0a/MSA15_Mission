import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        /* 학생 5명의 성적을 입력받아
            1차원 배열에 저장하고
            성적을 기준으로 오름차순
            내림차순 각각 출력
            (정렬 방식 -> 점수 0 이상 100 이하
         */
        Scanner sc = new Scanner(System.in);

        int[] grade = new int[5];
        for (int i = 0; i < grade.length; i++) {
            grade[i] = sc.nextInt();
        }

        // 선택 정렬 (오름차순)
        for (int i = 0; i < grade.length; i++) {
            for (int j = i+1; j < grade.length; j++) {
                if (grade[i] > grade[j]) {
                    int temp = grade[i];
                    grade[i] = grade[j];
                    grade[j] = temp;
                }
            }
            System.out.print(grade[i] + " ");
        }
        System.out.println();
        // 내림차순
        for (int i  = 0; i < grade.length; i++) {
            for (int j = i+1; j < grade.length; j++) {
                if (grade[i] < grade[j]) {
                    int temp = grade[i];
                    grade[i] = grade[j];
                    grade[j] = temp;
                }
            }
            System.out.print(grade[i] + " ");
        }
    }
}
