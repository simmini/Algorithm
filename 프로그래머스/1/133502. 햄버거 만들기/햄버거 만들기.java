import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
         int answer = 0;
        Stack<Integer> stack=new Stack<Integer>();

        for(int i:ingredient){
            stack.add(i);
            if(stack.size()>=4){
                if(stack.get(stack.size()-4)==1
                        && stack.get(stack.size()-3)==2
                        && stack.get(stack.size()-2)==3
                        && stack.get(stack.size()-1)==1){
                    answer++;
                    for(int j=0;j<4;j++){
                        stack.pop();
                    }

                }
            }


        }
        return answer;
    }
}