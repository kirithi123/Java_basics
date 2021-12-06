package com.training.ninja;
import java.util.Scanner;

public class Java_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello, world!");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Enter the number of legs for a dog:" + num);
        input.close();
        if (num==0) {
        	System.out.println("Fish");
        	
        }
        	else if (num==2) {
        	System.out.println("Parrot");
        	
        }
        
        	else if (num==3) {
        		System.out.println("Bunny");
        		
        	}
        	else if (num==4) {
        		System.out.println("Dog/cat");
        	}
        	else {
        		System.out.println("Invalid");
        	}
	}

}
