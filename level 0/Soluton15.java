class Solution15 {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if (s(dots[0],dots[1]) == s(dots[2],dots[3])) {
            answer = 1;
        }else if (s(dots[0],dots[2]) == s(dots[1],dots[3])) {
            answer = 1;
        }else if (s(dots[0],dots[3]) == s(dots[1],dots[2])) {
            answer = 1;
        }else
            answer = 0;
        return answer;
    }
    public double s(int [] arr1,int [] arr2) {
        return (arr2[1]-arr1[1]) * 1.0 / (arr2[0]-arr1[0]);
    } 
}
// 평행
// 처음엔 앞 뒤 숫자의 차이로 풀려다가 생각처럼 안 돼서 힌트를 봤더니 기울기를
// 이용하라고 해서 어떻게 풀긴 했다..