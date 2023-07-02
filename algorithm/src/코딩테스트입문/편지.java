package Programmers;

public class 편지 {

	static class Solution {
	    public int solution(String message) {
	        int answer = 0;
	        
	        
	        char []a=message.toCharArray();
	        answer=a.length*2;
	        
	        answer=message.length();
	        System.out.println(answer);
	        return message.length()*2;
	    }
	}
	
	
	public static void main(String[] args) {
		String a="happy birthday!";	
		Solution sol=new Solution();
		sol.solution(a);
		
		
	}

}
