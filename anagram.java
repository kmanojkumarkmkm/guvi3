import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	
	public static void main(String[] args)throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE 1st String");
        String s1=in.nextLine();
        s1=s1.toLowerCase();
        System.out.println("ENTER THE 2st String");
        String s2=in.nextLine();
        s2=s2.toLowerCase();
	char[] ch1=s1.toCharArray();
	char[] ch2=s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1, ch2))
	{
		System.out.println("anagram");
	}
	else
		
		System.out.println("not a anagram");
	//-----------------------//
	
	
	}
	
}
