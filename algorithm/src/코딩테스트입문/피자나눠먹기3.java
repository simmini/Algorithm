package 코딩테스트입문;

public class 피자나눠먹기3 {
	static class Solution {
	    public int solution(int slice, int n) {
	        int answer = 0;
	        
	        answer=n%slice==0?n/slice:n/slice+1;
	        
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol=new Solution();
		sol.solution(7,10);
	}

}
