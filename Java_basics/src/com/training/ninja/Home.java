package com.training.ninja;

public class Home {
	
	
		
		private String name;
		private double area;
		private int noOfRooms;
		private int noOfFloors;
		
		public void setName(String homeName) {
			name=homeName;
		}
		
		public void setArea(double homeArea) {
			area=homeArea;
		}
		
		public void setRooms(int rooms) {
			noOfRooms=rooms;
		}
		
		public void setFloors(int floors) {
			noOfFloors=floors;
		}
		
		public String getName() {
			return name;
		}
		
		public double getArea() {
			return area;
		}
		
		public int getRooms() {
			return noOfRooms;
		}
		
		public int getFloors() {
			return noOfFloors;
		}
		
		public void cleanUp() {
			System.out.println(name +" is cleaned!!");
		}
		
		public void paintIt() {
			System.out.println(name+" is painted!!");
		}

	

}
