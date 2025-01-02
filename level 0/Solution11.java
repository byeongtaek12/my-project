class Solution11 {
    public int solution(String[] babbling) {
        int result = 0;  
        String[] babble = {"aya", "ye", "woo", "ma"}; 
        
        
        for (String i : babbling) {
            for (String j : babble) {
                if (i.indexOf(j) > -1) {
                   
                    i = i.replace(j, " ");
                }
            }
           
            if (i.trim().length() == 0) {
                result++;  
            }
        }
        
        return result; 
    }
}
//옹알이
//이제부턴 정답률 낮은 순으로 풀기로 했는데 난이도가 갑자기 너무 어렵..
//힌트 봐도 어려워서 답지보고 이해하면서 풀었..
