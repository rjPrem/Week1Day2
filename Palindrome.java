package week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = "madam";
String rev = "";
char[] chararray = text.toCharArray();
int length = chararray.length;
for (int i = length - 1 ; i >=0; i--)
rev = rev+chararray[i];
		if(text.equalsIgnoreCase(rev))
		{
	System.out.println("String is Palindrome");
}
		else
		{
			System.out.println("String is Not Palindrome");
		}
	}

}
