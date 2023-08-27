import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// String col[]=br.readLine().split("");

		String arr[][] = new String[5][15];

		for (int i = 0; i < 5; i++) {
			String[] strArr = br.readLine().split("");
			for (int j = 0; j < strArr.length; j++) {
				arr[i][j] = strArr[j];
			}
		}
		//System.out.println(Arrays.toString(arr));
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i]!=null) {
					System.out.print(arr[j][i]);
				}
			}
		}

	}
}
