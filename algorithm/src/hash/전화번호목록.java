package hash;

import java.util.Arrays;

public class 전화번호목록 {
	
	static class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        Arrays.sort(phone_book);
	        for(String i:phone_book) {
	        System.out.println(i);
	        }
	        for(int i=0;i<phone_book.length-1;i++) {
	        if(phone_book[i+1].startsWith(phone_book[i])) {
	        		
	        	answer=false;
	        	break;
	        }
	        }
	        return answer;    
	    }
	    
	
	  public boolean solution1(String[] phone_book) {
		  boolean answer = true;
		  
		  
		  Arrays.sort(phone_book);
	        for(String i:phone_book) {
	        System.out.println(i);
	        }
	        for(int i=0;i<phone_book.length-1;i++) {
	        if(phone_book[i+1].equals(phone_book[i].substring())) {
	        		
	        	answer=false;
	        	break;
	        }
	        }
		  
		  
		  
		  return answer;
	          
	  
	  }
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub//1195524421
		String a[]= {"119", "97674223", "1195524421"};
		Solution sol=new Solution();
		
		System.out.println(sol.solution(a));
	}

}
