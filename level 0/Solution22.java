import java.util.Arrays;
class Solution22 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int last= array[array.length-1]+1;
        int [] arr = new int [last];
        int max = arr[0];
        
        for (int s: array) {
            arr[s]+=1;
        }
        
        for (int num: arr) {
            if (num > max) {
                max= num;
            }
        }
        int count=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==max) {
                count+=1;
                answer=i;
            }
        }
        if (count>1) {
            answer=-1;
        }
       
        return answer;
    }
}
//최빈값 구하기
//숫자를 배열의 인덱스로 하여 값이 높으면 그 숫자가 많이 나온 숫자이므로 그 숫자를 반환하게끔 만들었다.