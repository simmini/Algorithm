package 코딩테스트입문;

import java.util.HashMap;

public class 최빈값구하기 {
	static class Solution {
	    public int solution(int[] array) {
	       
	    	 int answer = 0;
	      
	        HashMap<Integer, Integer> map=new HashMap<>();
	        int max=0;
	        for(int i:array) {
	        	map.put(i, map.getOrDefault(i, 0)+1); 
	        	if(map.get(i)>max) {
	        		answer=i;//해당 값
	        		max=map.get(i);//중복횟수	
	        	}
	        }
	        System.out.println(max);
	        boolean flag=false;
	        
	        for(int i:array) {
	     
	        	System.out.println("출력"+map.get(i));
	        	if(map.get(i)==max) {        		
	        		flag=true;
	        		break;
	        	}
	        	
	        }
	        if(!flag) {
	        	answer=-1;
	        }
	
	        return answer;
	    }
	    
	    public int solution1(int[] array) {
	    
	    int answer = 0;
	      int[] arr = new int[array.length + 1];

	      int control = 0;
	      int dup = 0;
	      

	      for (int i = 0; i < array.length; i++) {
	         arr[array[i]]++;
	      }

	      for (int i = 0; i < arr.length; i++) {
	    	  //arr[array[i]]++;
	    	  if (arr[i] > control) {
	            control = arr[i];
	            answer = i;
	            
	         } 
	    	  
	      }
	      
	      
	      if (arr.equals(control)) {
	          dup++;
	       if(dup > 1) { 
	    	   answer=  -1;
	    	   
	    	   }
	       }
	      
//	      for (int i = 0; i < arr.length; i++) {
//	         if (arr[i] == control) {
//	            dup++;
//	            if(dup > 1) { return -1;}
//	         }
//	      }

	      return answer;
	    }
	      
	      
	    
	}
	public static void main(String[] args) {
		Solution sol=new Solution();
		int[] arr={1, 1, 2, 2};
		
		//System.out.println(sol.solution(arr));
		System.out.println(sol.solution(arr));
	
	}

}
