package cscorner;
//Multiple inheritances can be achieved through the use of interfaces. Interfaces are similar to classes in that they define a set of methods that can be implemented by classes
interface Walkable { 
	void walk(); 
} 
interface Swimmable { 
	void swim(); 
} 
class Duck implements Walkable, Swimmable { 
	public void walk() 
	{ 
		System.out.println("Duck is walking."); 
	} 
	public void swim() 
	{ 
		System.out.println("Duck is swimming."); 
	} 
} 
public class multipleinheritance { 
	public static void main(String[] args) 
	{ 
		Duck duck = new Duck(); 
		duck.walk(); 
		duck.swim(); 
	} 
}


