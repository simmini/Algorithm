import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
           int[] answer = new int[s.length()];
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){//중복아닌경우
                answer[i]=-1;
                map.put(s.charAt(i),i);
            }else{//중복인 경우
                answer[i]=i-map.get(s.charAt(i));
                map.put(s.charAt(i),i);
            }

        }
        return answer;
    }
}