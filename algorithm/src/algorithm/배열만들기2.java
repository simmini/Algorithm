package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기2 {
	
	static class Solution {
	    public int[] solution(int l, int r) {
	      
	        ArrayList<Integer> list=new ArrayList<>();
	 
	        for(int i=l;i<=r;i++) {
	        	String a=Integer.toString(i);
	        	if((a.contains("5")||a.contains("0"))&&!a.contains("1")&&!a.contains("2")&&!a.contains("3")&&!a.contains("4")&&!a.contains("6")&&!a.contains("7")&&!a.contains("8")&&!a.contains("9")) {
	        		list.add(i);
	        	}
	        	
	        }
	        
	        int [] answer;
	        
	        if(list.size()>0) {
	        	answer= new  int[list.size()]; 
	        	//1. int (primitive)변환-전통
//	        		for(int i=0;i<list.size();i++) {
//	        			answer[i]=list.get(i);
//	        		}
	        	//2. int (primitive)변환-streamAPI
	        	answer=list.stream().mapToInt(i->i).toArray();
	        }else {
	        	answer= new  int[1]; 
	        	answer[0]= -1;
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
		int l=5;
		int r=555;
		
		Solution sol=new Solution();
		
		int[]a=sol.solution(l, r);
		if(a.length>0) {
			System.out.println(Arrays.toString(a));
		}
		
		
	}
}
