import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Vowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
    char ch;
    Scanner scan=new Scanner(System.in);
    System.out.println("");
    ch=scan.next().charAt(0);
    if(ch=='a')
    {
    	System.out.println("vowel");
    }
    else
    {
    	System.out.println("not  vowel");
    }
    }
	}
