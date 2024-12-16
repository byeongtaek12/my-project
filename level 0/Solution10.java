import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) { //빈칸 부분1
            answer = 2030-year+1; //빈칸 부분2
        }
        else if (age_type.equals("Year")) {
            answer = 2030-year; //빈칸 부분3
        }

        System.out.println(answer);
    }
}
// 나이 계산
// 빈칸 채우기