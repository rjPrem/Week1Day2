package week1.Day2;

public class FindDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 14, 12, 15, 13, 16, 14, 18, 15, 17, 20, 18 };
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j])
					System.out.println(num[i]);
			}
		}

	}

}
