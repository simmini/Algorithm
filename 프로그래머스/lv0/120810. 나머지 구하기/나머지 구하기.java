class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        while(num1>=num2){
            num1=num1-num2;
        }
        answer=num1;
        //1.방법
       //answer= num1%num2
        return answer;
    }
}