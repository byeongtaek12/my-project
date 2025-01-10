class Solution28 {
    public int solution(String A, String B) {
        int answer = -1;
        String A1 = A;
        for (int i=0; i<A.length(); i++) {
            if (A1.equals(B)) {
                answer=i;
                break;
            }
            A1=A1.charAt(A.length()-1) + A1.substring(0,A.length()-1);
        }
       
        return answer;
    }
}
//문자열 밀기
// 어떻게 여러번 미는 걸 구현할까 생각하다 끝끝내 답을 찾지 못해서 GPT
// 물어봤는데 와 반복문으로 여러 번 밀 수가 있구나라고 깨달았다.. 매번 아쉬운 문제는 도움 받고 나면 이렇게
//할 수 있구나라는 생각이 든다. 