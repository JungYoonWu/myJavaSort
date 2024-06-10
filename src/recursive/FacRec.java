package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacRec {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(factoRec(n));

	}
	static long factoRec(long num) {
		if(num==0 || num==1) {
			return 1;
		}
		return num*factoRec(num-1);
	}
}
