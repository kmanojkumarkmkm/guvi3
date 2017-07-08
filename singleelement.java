
import java.io.IOException;
import java.util.Scanner;

public class singleelement {
	public static void main(String[] args)throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE array length");
        int n=in.nextInt();
        int i,j,count = 0;
        int[] a = new int[100];
		for(i=0;i<n;i++)
        {
        	a[i]=in.nextInt();
        }
       for(i=0;i<n;i++)
       {
    	   count ^= a[i];
       }
       System.out.println(count);
     
	}
}
