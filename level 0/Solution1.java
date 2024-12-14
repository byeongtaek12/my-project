import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle%360); //고친 줄
    }
}
// 각도 합치기 한 줄을 고쳐서 제대로 출력되게 하기 
//0도 이상 360도 미만으로 출력되게끔
