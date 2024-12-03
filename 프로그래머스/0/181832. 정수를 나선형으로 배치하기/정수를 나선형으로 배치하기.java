class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
            int rowStart=0;
            int rowEnd=n-1;
            int colStart=0;
            int colEnd=n-1;

            int idx=1;
            while(idx<=n*n){

                    //→ 012
                for(int i=colStart;i<=colEnd;i++){
                    answer[rowStart][i]=idx++;
                    
                }
                rowStart++;//1
                
                //↓// 012
                for(int i=rowStart;i<=rowEnd;i++){
                    answer[i][colEnd]=idx++;
                }
                colEnd--;//1
                
                //← //321
                for(int i=colEnd;i>=colStart;i--){
                    answer[rowEnd][i]=idx++;
                }
                rowEnd--;//2
                
                
                //↑ 321
                for(int i=rowEnd;i>=rowStart;i--){
                    answer[i][colStart]=idx++;
                }
                colStart++;
            }

            return answer;
    }
}