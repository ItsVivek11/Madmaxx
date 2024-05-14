package cscorner;
import java.util.*;

public class similar

{

  public static void main(String [] args)

  {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter string1:");

    String a=sc.nextLine();

    System.out.println("Enter string2:");

    String b=sc.nextLine();

    String c="";

    int count=0;

    c=a+b;

    System.out.println(c);

    for(int i=0,j=a.length();i<a.length()&&j<c.length();i++,j++)

    {

      if(c.charAt(i)==c.charAt(j))

      {

        count=count+1;

      }

    }

    System.out.printf("common location characters:%d",count);

    if(count==a.length())

    {

    System.out.println("\n Entered strings are similar");

    }

    else

    {

    System.out.println("\nEntered strings are dissimilar");

    }

  }

}
