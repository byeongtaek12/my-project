import java.util.Arrays;
class Solution25 {
    public int[] solution(int[] numlist, int n) {
        Integer [] answer = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(answer, (a,b) -> {
            int diffA= Math.abs(a-n);
            int diffB= Math.abs(b-n);
            if (diffA == diffB) {
                return b-a;
            }return diffA - diffB;
        });
        
        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
    }
}// 특이한 정렬
// 이 문제가 절대값을 이용하는 것만 알았지 도무지 어떻게 해야 할지 감이 안 잡혀서 GPT로 물어보니 stream
// 과 람다식을 알려줬는데 스트림과 람다식을 잘 몰라서 계속 물어보면서 어떤 건지 알게 되었다. 언제 써야 되는
//건지는 아직 모르겠다..