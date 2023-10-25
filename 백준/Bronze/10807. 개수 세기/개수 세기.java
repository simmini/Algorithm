
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		int a, b;

		int sum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());
		int arr[] = new int[a];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		b = Integer.parseInt(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == b) {
				sum++;
			}
		}
		System.out.println(sum);
		
	}
}
