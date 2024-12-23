class Solution16 {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int [] linepoints = new int [201];
        
        for (int [] line :lines) {
            int start = line[0]+100;
            int end = line[1]+100;
            for (int i=start; i<end; i++) {
                linepoints[i]++;
            }
        }
        for (int count : linepoints) {
            if (count>1) {
                answer++;
            }
        }
        return answer;
    }
}
//겹치는 선분의 길이
// 도저히 감을 못 잡겠어서 힌트를 보고 풀었다... 힌트 보니까 와 이렇게 쉽게
// 풀 수 있다니 이 문제도 내 기준에서 신박했다.