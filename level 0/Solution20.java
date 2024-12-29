class Solution20 {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        answer[0] = (total*2/num+1-num)/2;
        
        for (int i=0; i<num-1; i++) {
           answer[i+1] = answer[i]+1;
        }
        return answer;
    }
}
//연속된 수의 합
// 이것도 문제는 쉬워보이지만 어떤 식으로 풀어야 할지 갈피를 못잡았다. 힌트보고
// 등차수열의 합 공식을 이용한다는 것을 알고 푸니까 쉬웠다.