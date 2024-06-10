package recursive;

public class SumRec {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(sumRec(n));
		
		//base-condition
		//n == 1 return 1
		//sum(1)
		
		//재귀적 분해
		//n=2 -> 2+ 1 1은 sum(1)
		//n=3 -> 3 + 2 + 1 2+1은 sum(2)
		
		//n = n -> n + sum(n-1);
	}
	
	static int sumRec(int num) {
		//1. base condition
		if(num == 1) {
			return 1;
		}
		//2. recursive decomposition & 조합
		return num + sumRec(num-1);
	}

}
