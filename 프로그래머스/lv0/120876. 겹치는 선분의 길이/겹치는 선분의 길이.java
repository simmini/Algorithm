import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int[][] lines) {
       int answer = 0;
	        HashMap<Integer,Integer> map=new HashMap<>();
	     
	        for(int i=lines[0][0];i<lines[0][1];i++) {
	 			map.put(i, map.getOrDefault(i, 0)+1);   	
	        }
	        
	        for(int i=lines[1][0];i<lines[1][1];i++) {
        		map.put(i, map.getOrDefault(i, 0)+1);
        		
        	}
	        for(int i=lines[2][0];i<lines[2][1];i++) {
	        	map.put(i, map.getOrDefault(i, 0)+1);
	        }
	        
	        for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
	        	if(entry.getValue()>=2) {
	        		System.out.println(entry.getKey()+":"+entry.getValue());
	        		answer+=1;
	        	}
	        	
	        }
	        System.out.println(answer);
	        return answer;
    }
}