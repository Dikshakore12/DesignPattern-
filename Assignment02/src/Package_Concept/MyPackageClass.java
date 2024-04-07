package Package_Concept;

import Package_Concept.MyPackageClass;

public class MyPackageClass {

	    public void display() {
	        System.out.println("This is a class inside mypackage");
	    }
	}
 class Main {
 public static void main(String[] args) {
     MyPackageClass obj = new MyPackageClass();
     // Calling the display method of MyPackageClass
     obj.display(); 
 }
}
