package FrameWork_java;

import java.util.ArrayList;

public class ArrayListDemo {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        
	        System.out.println("Elements in the ArrayList: " + list);
	        
	        System.out.println("Size of the ArrayList: " + list.size());
	        
	        System.out.println("Contains 'Banana': " + list.contains("Banana"));
	       
	        list.remove("Banana");
	        
	        System.out.println("Elements in the ArrayList after removal: " + list);
	        
	        list.clear();
	       
	        System.out.println("Is the ArrayList empty? " + list.isEmpty());
	    }
	}



