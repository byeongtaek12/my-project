class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        int count1= 0;
        String p = polynomial;
        String [] s = p.split(" ");
        for (int i=0; i<s.length; i++) {
            if (s[i].contains("x")) {
                String [] z1= s[i].split("x");
                int z2;
                if (z1.length>0) {
                    z2=Integer.parseInt(z1[0]);
                }else {
                    z2=1;
                }
                count+=z2;
            }else if (!s[i].equals("+")) {
                count1+=Integer.parseInt(s[i]);
            } 
        }
        if (count>0) {
            answer.append(count==1 ? "x" : count+"x");
        }
        if (count1>0) {
            if (answer.length()>0) {
                answer.append(" + ");
            }
            answer.append(count1);
        }else {
            answer.append("");
        }
        return answer.toString();
    }
}
//다항식 더하기
//이 문제에서 StringBuilder, 문자열 split(), Integer.PasreInt(); 등 여러가지로 많이 배워간 것 같다.