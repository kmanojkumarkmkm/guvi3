import java.io.IOException;
import java.util.Scanner;

public class ipaddress {
	public static void main(String[] args)throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        String n=in.nextLine();
        int l,i,j,k=0,x=0;
        l=n.length();
        char[] ch=n.toCharArray();
        for(i=0;i<l;)
        {
        	if(k<=2)
        	{
        		System.out.print(ch[i]);
        		k++;i++;
        	}
        	else
        	{
        		System.out.print(".");k=0;
        	}
        }System.out.print("\n");k=0;
        for(i=0;i<l;)
        {
        	if(k<=2)
        	{
        		if(x!=2)
        		{System.out.print(ch[i]);
        		k++;i++;}
        		else
        		{
        			System.out.print(ch[i]);
            		i++;k++;
        		}
        	}
        
        	else
        	{
        		System.out.print(".");k=0;x++;
        	}
        }
        
	}
}
