import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> s2List = Arrays.asList(s2);
        int answer = 0;
        for(String text : s1){
            if(s2List.contains(text)) {
                answer++;
            }
        }
        return answer;
    }
}