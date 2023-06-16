package hash;

import java.util.HashMap;

import hash.전화번호목록.Solution;

public class 전화번호목록_hash {

	
	static class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        HashMap<String,Integer> map=new HashMap<>();
	        int cnt=1;
	        for(String i:phone_book) {
	        	
	        	map.put(i,cnt++);
	        	
	        }
	        for(int i=0;i<phone_book.length;i++) {
	        	for(int j=0;j<phone_book[i].length();j++) {
	        		
	        		//map.put(j,phone_book[i].split("")[j]);
	        		
	        		System.out.println("머냐"+phone_book[i].substring(0,j));
	        		
	        		if(map.containsKey(phone_book[i].substring(0,j))) {
	        			
	        			answer= false;
	        		}  
	        		
	        		if(map.containsKey(phone_book[i].substring(0,1))) {
	        			answer=false;
	        		}
	        	
	        	}
	        	
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"119", "97674223", "1195524421"};
		Solution sol=new Solution();
		
		System.out.println(sol.solution(a));
	}

}
