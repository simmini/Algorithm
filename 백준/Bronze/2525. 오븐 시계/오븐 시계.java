
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

	 int a,b,c;

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine()," ");
	a=Integer.parseInt(st.nextToken());
	b=Integer.parseInt(st.nextToken());
	c=Integer.parseInt(br.readLine());
	
	int tmpMin=a*60+b;
	tmpMin=tmpMin+c;
	int hour=(tmpMin/60)%24;
	int min=tmpMin%60;
	
	System.out.println(hour+" "+min);
	
	
	}

}
