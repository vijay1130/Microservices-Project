package com.nt.str;

import java.util.Iterator;
import java.util.Scanner;

public class Shape implements Cloneable{
	
	private String type;
	private String color;
	
	
	Scanner sc= new Scanner(System.in);
	
	public Shape(String type,String color) {
		this.type=type;
		this.color=color;
	}
	
	 public void setType(String type) {
		 this.type=type;
	 }
	 public String getType() {
		 return type;
	 }
	 
	 public void setColor(String color) {
		 this.color=color;
	 }
	  
	 public String getColor() {
		 return color;
	 }
	 
	 
	 
	 @Override
	public String toString() {
		return "Shape [type=" + type + ", color=" + color+"]";
	}

	public void updateShape(Shape shape) {
	    
		 System.out.println("Enter the updateShape::");
		 String shap=sc.next();
		 
		 shape.setType(shap);
		 System.out.println(shape);
		 
	 }
	
	   public void updateColor(Shape shape) {
		   System.out.println("Enter The update color::");
		   String col=sc.next();
		  
		   shape.setColor(col);
		   System.out.println(shape);
	   }
	   
	   
	  
//	 
	 public static void main(String[] args) throws CloneNotSupportedException {
		Scanner sc=new Scanner(System.in);
		 Shape shape=new Shape("circle", "red");
		
		 System.out.println("-----------------------------------------------------------"); 
		 System.out.println("choose option: 1.cloneOblect  2.UpdateShape   3.UpdateColor");
		 System.out.println("-----------------------------------------------------------");
		 System.out.println(shape);
		 
		 for (int i = 0; i < 3; i++) {
			
		
		 System.out.println("Enter Choose Option::");
		 int option=sc.nextInt();
		 
		 if(option==1) {
		 System.out.println("clone():"+shape.clone());
		 }
		 else if(option==2) {
			 shape.updateShape(shape);
		 }
		 else if (option==3) {
			shape.updateColor(shape);
		}
		 else {
			 System.err.println("Option is not vailed");
		 }
		//shape.updateShape(shape);
		 //shape.updateColor(shape);
		
		 }
		 
		
	}
	 
	 
	}
