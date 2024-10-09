class Solution {
    public int solution(int number, int limit, int power) {
       int answer = 0;

        //1부터 n까지 다 나눠보고 0으로 나눠지면은
        int tmp[]=new int[number];
        for(int i=1;i<=number;i++){
            for(int j=1;j*j<=i;j++){
                if(j*j==i){
                    tmp[i-1]++;

                } else if(i%j==0){
                    tmp[i-1]+=2;
                }
            }
        }
        for(int i=0;i<number;i++){
            System.out.println(tmp[i]);
            if(tmp[i]<=limit){
                answer+=tmp[i];
            }else{
                answer+=power;
            }
        }

        return answer;
    }
}


