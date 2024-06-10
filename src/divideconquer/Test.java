package divideconquer;

public class Test {
	public static void main(String[]args) {
		
	}
	static int coinCnt(int price, int[] coin) {
		int cnt = 0;
		
		for(int i = 0; i < coin.length; i++	) {
			if(coin[i] > price) {continue;}
			
			cnt = cnt + price/coin[i];
			price = price - (coin[i] * cnt);
			if(price == 0) {
				break;
			}
		}
		
		return cnt;
	}
}
