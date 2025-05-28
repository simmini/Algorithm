import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    static boolean[][]graph;
    static boolean[]visited;
    static int n,m;
    static int answer;

    public static void dfs(int index){
        visited[index] = true;
        IntStream.range(0,n).forEach(i->{
            if (!visited[i]&&graph[index][i]){
                dfs(i);
            }
        });
        answer++;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());

        graph=new boolean[n][n];
        visited=new boolean[n];
        int x,y;
        for(int i=0;i<m;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            x=Integer.parseInt(st.nextToken())-1;
            y=Integer.parseInt(st.nextToken())-1;
            graph[x][y]=true;
            graph[y][x]=true;

        }
        dfs(0);
        System.out.println(answer-1);
        br.close();



    }
}
