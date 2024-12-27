class Solution19 {
    public int solution(int[][] board) {
        int answer = 0;
        int r = board.length;
        int c = board[0].length;
        
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (issafe(board,i,j)) {
                    answer+=1;
                }
            }
        }
        return answer;
    }
    public boolean issafe(int [][] board,int x, int y) {
        for (int i=-1; i<=1; i++) {
            for (int j=-1; j<=1; j++) {
                try {
                    if (board[x+i][y+j]==1) {
                        return false;
                    }
                }catch (ArrayIndexOutOfBoundsException e) {
                        continue;
                }
            }
        }
        return true;
    }
}
// 안전지대
// 정답률 낮은 순으로 푸니까 이젠 어떻게 풀까만 생각 엄청하고 실행에 옮기기가 어렵다
// 힌트보고 풀었는데 try catch로 하는데 신기했다