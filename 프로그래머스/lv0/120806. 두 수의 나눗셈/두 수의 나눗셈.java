class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
     
        //둘중 하나를 double로 해줘야 몫도 double로 나온다.
        //둘다 int면 몫도 int로 나온다. 
         double a=num1/(double)num2;
	     answer=(int)(a*1000);
        return answer;
    }
}