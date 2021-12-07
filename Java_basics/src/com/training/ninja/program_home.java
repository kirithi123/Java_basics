package com.training.ninja;

public class program_home {

	

		public static void main(String[] args) {
			
			// Create an object of class Home
			Home home1=new Home();
			
			//Set the values of the instance variables	
			home1.setName("The Barn");
			home1.setArea(3000);
			home1.setRooms(5);
			home1.setFloors(2);
			
			System.out.println("Home Details:");
			System.out.println("Name: "+home1.getName());
			System.out.println("Area: "+home1.getArea());
			System.out.println("No. of rooms: " +home1.getRooms());
			System.out.println("No. of Floors: "+home1.getFloors());
			System.out.println("-----------------------------------");
			
			//Create another object of class Home 
			Home home2=new Home();
			home2.setName("The BrickHouse");
			home2.setArea(2000);
			home2.setRooms(3);
			home2.setFloors(1);
			
			System.out.println("Home Details:");
			System.out.println("Name: "+home2.getName());
			System.out.println("Area: "+home2.getArea());
			System.out.println("No. of rooms: " +home2.getRooms());
			System.out.println("No. of Floors: "+home2.getFloors());
			System.out.println("-------------------------------------");
			
			home1.cleanUp();
			home2.paintIt();

		}
		
		

	
}
