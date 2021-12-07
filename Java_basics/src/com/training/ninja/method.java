package com.training.ninja;


public class method {
	
	
	// Method to add two integers 
	public static int add(int n1,int n2){
		int sum=n1+n2;
		return sum;
	
	}
	public static void main(String[] args) {
		int num1=1,num2=7,num3=8;
		int s=add(num1,num2);      //Calls the method add with 2 parameters
		System.out.println(num1+" + "+num2+" = "+s);
     
		
		
	}

}