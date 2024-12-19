class Solution12 {
    public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
        
        for (int i=0;i<quiz.length; i++) {
            String [] s=quiz[i].split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[2]);
            int result=Integer.parseInt(s[4]);
            
            if (s[1].equals("-") && x-y==result) {
                answer[i]="O";
            }else if (s[1].equals("+") && x+y==result) {
                answer[i]="O";
            }else
                answer[i]="X";
        }
        return answer;
    }
}
//OX퀴즈 
//이제 어떤 식으로 풀어야 할지 구상은 되는데 문법이 아직 익숙하지 않네..
