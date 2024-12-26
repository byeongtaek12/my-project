class Solution18 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        if (denom1 == denom2) {
            answer[0]=numer1+numer2;
            answer[1]=denom1;
        }else {
            answer[0]= numer1*denom2 + numer2*denom1;
            answer[1]= denom1 * denom2;
            }
        int gcd= gcd(answer[0],answer[1]);
        answer[0]/=gcd;
        answer[1]/=gcd;
        
        return answer;
    }
    public int gcd(int a,int b) {
        while (b !=0) {
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}
// 할만 하다고 생각했는데 최대공약수를 어떻게 표현해야 할지 모르겠어서 서치하다가 풀게
//되었다.. 문득 최대공약수 같은 코드는 어떻게 생각해야 하는 걸까? 라는 생각이 들었다.
// 머리로 짜낼 수가 없을 것 같은데.. 다른 사람들은 서치 안하고 한번에 하는 걸까?