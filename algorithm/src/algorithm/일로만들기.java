package algorithm;

public class 일로만들기 {
	
	static class Solution {
	    public int solution(int[] num_list) {
	        int answer = 0;
	        
	        
	        for(int i:num_list) {
	        	while(i>1) {
	        		if(i%2==0) {
	        			i=i/2;
	        			
	        		}else {
	        			i=(i-1)/2;
	        		}
	        		answer++;
	        		
	        	}
	        	
	        }
	        
	        
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		
		Solution sol=new Solution();
		int num_list[]= {12,4,15,1,14};
		System.out.println(sol.solution(num_list));
		
	}

}
