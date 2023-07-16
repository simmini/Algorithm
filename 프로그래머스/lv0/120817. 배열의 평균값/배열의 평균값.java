class Solution {
    public double solution(int[] numbers) {
         double answer = 0;
        for(int i:numbers){
	            answer+=i;
	        }
        //answer가 double이기떄문에 굳이 캐스팅안해줌
	        answer/=numbers.length;
        return answer;
    }
}