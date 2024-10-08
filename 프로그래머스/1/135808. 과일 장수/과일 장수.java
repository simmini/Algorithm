
import java.util.Arrays;
class Solution {
    public static int solution(int k, int m, int[] score) {
           
        int answer = 0;
            Arrays.sort(score);
        

            //i-m=12-3=9개

            //10개가 있는데 뒤에서 부터 4개씩 뽑아
            //뽑고나서 4개는 뺴줘
            //와,..,,,,,,,짱이다,,,진짜,,,
            //10-4=6
            //6-4=2
            //2-4<4

            for(int i=score.length;i>=m;i-=m){//12개,3개
                answer+=score[i-m]*m;//tmp[12-3]=9*3

            }


            return answer;
        }
}