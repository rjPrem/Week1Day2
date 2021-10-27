package week1.Day2;

import java.util.Arrays;

public class SecondLargest {
public static void main(String[] args) {
	int num[] = {3,2,11,4,6,7};
	int length = num.length;
	Arrays.sort(num);
	System.out.println("Second Largest Array is:"+ num[length-2]);
	
}
}
