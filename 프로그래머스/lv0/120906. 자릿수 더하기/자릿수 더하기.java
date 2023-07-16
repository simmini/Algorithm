class Solution {
    public int solution(int n) {
        int answer = 0;
        // while(n>0) {
        // 	answer+=n%10;
        // 	n=n/10;
        // }
        
       //int를 String으로 변환 :Integer.toString     
        String []s=Integer.toString(n).split("");
        for(int i=0;i<s.length;i++) {
        	
            //String을 int로 변환?
        	answer+=Integer.parseInt(s[i]);
        }
      
        return answer;
    }
}