package hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주하지못한선수_hash {

	
	static class Solution{
		public String solution(String[] participant,String []completion) {
		
			String answer="";
		
			HashMap<String,Integer>map=new HashMap<>();
			
			for(String i:participant) {
				
				map.put(i, map.getOrDefault(i,0)+1);
				System.out.println("a"+map.getOrDefault(i,0)+":"+map.keySet());
			}
			for(String i:completion) {
				map.put(i,map.get(i)-1);
				System.out.println("b"+":"+map.keySet());
			}
		
			Iterator<Map.Entry<String, Integer>> iter=map.entrySet().iterator();
			
			//Iterator <String> iter1=map.keySet().iterator();
			
			
			while(iter.hasNext()){
				Map.Entry<String,Integer> entry=iter.next();
				if(entry.getValue()!=0) {
					answer=entry.getKey();
				}
				
				
			}
		
			return answer ;
		}
	
	
	}
	public static void main(String[] args) {
		
		String []a= {"leo", "kiki", "eden"};	
		String []b= {"eden", "kiki"};

		Solution sol=new Solution();
		String ans=sol.solution(a, b);
		
		System.out.println(ans);
		
		
		
		
	}

}
