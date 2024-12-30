class Solution21 {
    public int solution(int[] common) {
        int answer = 0;
        int x=common[0];
        int y=common[1];
        int z=common[2];
        int s=common[common.length-1];
        
        if (z-y==y-x) {
            answer=s+(z-y);
        }else if (z/y==y/x) {
            answer=s*(z/y);
        }
        
        return answer;
    }
}
//다음에 올 숫자
//등비수열로 코딩한지 얼마 안돼서 그런가 엄청 쉽게 풀었다.