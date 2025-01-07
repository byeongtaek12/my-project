import java.util.ArrayList;
class Solution26 {
    public int[] solution(int l, int r) {
        ArrayList <Integer> answer = new ArrayList<>();
        
        for (int i=l; i<=r; i++) {
            if (s(i)) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            return new int []{-1};
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public boolean s(int x) {
        String str = String.valueOf(x);
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)!='5'&& str.charAt(i)!='0'){
                return false;
            }
        }
        return true;
    }
}//배열 만들기 2
// 문제를 풀면 풀수록 다양해서 재밌기도 하지만 계속해서 막히는 부분이 생기니까 답답하기도 하네.. 쌓이고 쌓이면
// 괜찮겠지 아직은 초보라서 그런 것이겠지..
