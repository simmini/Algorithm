import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int x=sc.nextInt();
        int answer=0;
        int startPoint=0;
        int endPoint=n-1;

        Arrays.sort(arr);
        //1 2 3 5 7 9 10 11 12
       while(startPoint!=endPoint){
           int sum=arr[startPoint]+arr[endPoint];
            if(sum==x){
                answer++;
                startPoint++;
            }else if(sum<x){
                startPoint++;
            }else if(sum>x){
                endPoint--;
            }

       }
        System.out.println(answer);

    }
}
