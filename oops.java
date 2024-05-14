package cscorner;
//Encapsulation: Using private access modifiers to hide the internal details of a class
class oop {
 private String name;
 private int age;

 // Abstraction: Providing a simple interface and hiding the complex implementation details
 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("Age must be a positive number");
     }
 }

 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Inheritance: Creating a new class "Employee" that inherits from the "Person" class
class Employee extends oop {
 private String employeeId;

 public void setEmployeeId(String employeeId) {
     this.employeeId = employeeId;
 }

 // Polymorphism: Overriding the displayDetails method in the derived class
 @Override
 public void displayDetails() {
     super.displayDetails();  // calling the displayDetails method of the base class
     System.out.println("Employee ID: " + employeeId);
 }
}

//Main class to test the program
public class oops {
 public static void main(String[] args) {
     // Creating an object of the derived class "Employee"
     Employee employee = new Employee();

     // Using encapsulation to set the details of the person
     employee.setName("John Doe");
     employee.setAge(25);

     // Using encapsulation to set the employee details
     employee.setEmployeeId("E12345");

     // Using polymorphism to display the details
     employee.displayDetails();
 }
}

