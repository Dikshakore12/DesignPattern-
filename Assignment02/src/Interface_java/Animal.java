package Interface_java;
	
	interface Animal {
	    void sound(); // Abstract method
	}

	// Implement the interface
	class Dog implements Animal {
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	// Implement another class
	class Cat implements Animal {
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	}

    class InterfaceDemo {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        Cat cat = new Cat();
	        
	        dog.sound(); 
	        cat.sound(); 
	    }
	}



