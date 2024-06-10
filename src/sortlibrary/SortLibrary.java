package sortlibrary;

import java.util.Arrays;

public class SortLibrary {
	
	public static void main(String[]args) {
		
	}
	static void sortInteger() {
		Integer[] dataList = {40,15,34,21,66,53};
		System.out.println("원본 : " + Arrays.toString(dataList));
		
		Arrays.sort(dataList);
		System.out.println();
	}
}
