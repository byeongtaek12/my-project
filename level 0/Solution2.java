import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<1; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer+number); //고친 줄
    }
}
//수 나누기 입력된 수를 2자리씩 나눠 합치기
