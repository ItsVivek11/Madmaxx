package cscorner;
//In Java, there is no concept of global variables; since Java is an Object-oriented programming language, everything is a part of the Class. But if we want to make a variable globally accessible, we can make it static by using a static Keyword.
class Demo {  
	  
	   // static variable  
	   static int a = 10;  
	    
	   // non-static or local variable  
	   int b = 20;  
	}  
	  
	public class variables {  
	   public static void main(String[] args) {  
	       Demo obj = new Demo();  
	  
	       // accessing the non-static variable  
	       System.out.println("Value of non-static variable is: " + (obj.b));  
	  
	       // accessing the static variable  
	       System.out.println("Value of static variable is:" + (Demo.a));  
	   }  
	}  
