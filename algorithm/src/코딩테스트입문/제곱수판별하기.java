package 코딩테스트입문;

public class 제곱수판별하기 {
	
	static class Solution {
	    public int solution(int n) {
	        int answer = 0;
	    
	        double Danswer=Math.sqrt(n);
	    
	        String str=String.valueOf(Danswer);
	        String numcheck=str.substring(str.indexOf("."));
	        
	        if(numcheck.equals(".0")) {
	        	answer=1;
	        }
	        else {
	        	answer=2;
	        }

	        System.out.println(answer);
	        return answer;
	    }
	}

	public static void main(String[] args) {
		Solution sol=new Solution();
		sol.solution(144);

	}

}
