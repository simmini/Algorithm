package algorithm;

import java.util.HashMap;

public class 등차수열의특정한항만더하기 {

	
	static class Solution {
	    public int solution(int a, int d, boolean[] included) {
	        int answer = 0;
	        HashMap<Integer,Boolean>map=new HashMap<>();
	        for(int i=1;i<=included.length;i++) {
	        	int sum=a+(i-1)*d;
	        	map.put(sum,included[i-1]);
	        	if(map.get(sum).equals(true)) {
	        		answer+=sum;
	        		
	        	};
	        }
	        
	        return answer;
	    }
	}
	
	static class Solution1 {
	    public int solution(int a, int d, boolean[] included) {
	        //int []list = new int[included.length];
	        HashMap<Boolean,Integer> hm = new HashMap<>();
	        
	        for (int i = 0; i < included.length; i++) {
	         int sum = a + (i*d);
	         
	        	hm.put(included[i],hm.getOrDefault(included[i], 0)+ sum);
	         
	        }
	        return hm.get(true);
	    }
	}
	
	public static void main(String[] args) {
		
		
		boolean included[]= {true,false,false,true,true};
		Solution sol=new Solution();
		int a=sol.solution(3, 4, included);
		System.out.println(a);
	
		Solution1 sol1=new Solution1();
		int b=sol1.solution(3, 4, included);
		System.out.println(b);
	
	}

}
