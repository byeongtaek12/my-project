class Solution14 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int i;
        answer[0][0] = 1;
        for (i=1; i < n; i++) {
            answer[0][i] = i + 1;     //첫 줄을 만들어서 좌표를 0,3에서 시작
        }
        int zx= n;    // 행으로 n칸 채워야 하니까 n으로 설정
        int zy= n-1;  // 행으로 n칸 채우고 열로 n-1칸 채워야 하니까 n으로 설정
        int x= n-1;   // 현재 좌표부터 찍기
        int y= 0;  // 위와 같은 이유
        int a=n; 
        
        while (a<n*n) {
            for (i=0; i<zy; i++) {
                a+=1;
                y+=1;
                answer[y][x]=a;
                }
            zx-=1; //첫 좌표 0,3에서 점점 아래로
            
            for (i=0; i<zx; i++) {
                a+=1;
                x-=1;
                answer[y][x]=a;
            }
            zy-=1; //왼쪽으로
            
            for (i=0; i<zy; i++) {
                a+=1;
                y-=1;
                answer[y][x]=a;
                }
            zx-=1; //위쪽으로
            
            for (i=0; i<zx; i++) {
                a+=1;
                x+=1;
                answer[y][x]=a;
            }
            zy-=1; //오른쪽으로
            
                
        }
        
        return answer;
    }
}//정수를 나선형으로 배치하기
//정답률이 정말 낮던데 진짜 막막 했다.. 한편으로는 이런 방법이 있네 하고 신기하기도..
