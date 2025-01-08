class Solution27 {
    public int solution(int a, int b) {
        int answer = 0;
        int a1= a/s(a,b);
        int b1= b/s(a,b);
        while (b1%2==0) {
            b1=b1/2;
        }
        while (b1%5==0) {
            b1=b1/5;
        }
        if (b1==1) {
            answer=1;
        }else {
            answer=2;
        } 
        return answer;
    }
    public int s(int x,int y) {
        while (y!=0) {
            int temp = y;
            y = x%y;
            x= temp; 
        }
        return x;
    }
}// 유한소수 판별하기
//유클리드 호제법을 그전에 배운 적이 있어서 이용하여 풀어봤고 나름 이번 문제는 풀만 했던 것 같다..