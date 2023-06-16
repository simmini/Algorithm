package hash;

import java.util.HashMap;
import java.util.Iterator;

public class 의상 {
	
	static class Solution {
	    public int solution(String[][] clothes) {
	        int answer = 1;
	        HashMap<String, Integer> map=new HashMap<>();
	        for(int i=0;i<clothes.length;i++) {//행
	        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
	        	
	        }

	        for(String key:map.keySet()) {
	       
	        	System.out.println(key+"gm"+map.get(key));
	        	answer*=map.get(key)+1;
	        	
	        }
	        int answer1 = 1;
	        Iterator<Integer> it=map.values().iterator();
	        while(it.hasNext()) {
	        	System.out.println("it:"+it.next().intValue()+1);
	        	answer1*=it.next()+1;
	        }
	        
	       System.out.println(answer1);
	        return answer-1;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String clothes[][]= {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
			Solution sol=new Solution();
			int a=sol.solution(clothes);
			System.out.println(a);
	}

}
