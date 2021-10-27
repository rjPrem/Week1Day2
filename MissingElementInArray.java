package week1.Day2;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 7, 6, 8 };
		int j;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				j = i + 1;
				System.out.println(j);
				break;
			}
		}

	}

}
