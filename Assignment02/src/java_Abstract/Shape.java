package java_Abstract;

public abstract class Shape {
	    abstract void draw();
	}

	class Circle extends Shape {
	    void draw() {
	        System.out.println("Drawing Circle");
	    }
	}

 class AbstractClassDemo {
	    public static void main(String[] args) {
	        Shape circle = new Circle();
	        
	        circle.draw(); 
	    }
	}



