class Solution24 {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i=0; i<code.length(); i++) {
            if (code.charAt(i)=='1' && mode == 0) {
                mode=1;
            }else if (code.charAt(i)=='1' && mode == 1) {
                mode=0;
            }else if (code.charAt(i)!='1' && mode == 0) {
                if (i%2==0) {
                    answer.append(code.charAt(i));
                }
            }else if (code.charAt(i)!='1' && mode == 1) {
                if (i%2==1) {
                    answer.append(code.charAt(i));
                }
            }
        }
        return answer.length()==0 ? "EMPTY" : answer.toString();
    }
}
//코드 처리하기
//문제만 이해를 잘하고 StringBuilder를 이용한다면 정말 쉽게 풀 수 있네요..