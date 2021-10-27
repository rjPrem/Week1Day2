package week1.Day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'n') {

				count++;
			}
		}
		System.out.println("Number of Occurences of character n: " + count);

	}
}
