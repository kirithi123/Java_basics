package com.training.ninja;

import java.util.Arrays;
import java.util.Scanner;

public class HP_movie {

	public static void main(String[] args) {
		//6th
		int movie_num[]=new int [8];
		String movie_name[]= {"Philosophers stone","Chamber of Secrets","Prisoner","Goblet of fire","Order of Phoenix","Half blood prince","Dethly Hallows-1","Deathly Hallows-2"};
        int release_yr[]= {2001,2002,2004,2005,2007,2009,2010,2011};
        int index=Arrays.binarySearch(movie_name,"Chamber of Secrets");
        System.out.print("The movie name is at position:" + index +"\n");
        //1st 
        int len=release_yr.length;
        int last_yr=release_yr[len-1];
        int first_yr=release_yr[0];
        int no_of_lapse=last_yr - first_yr;
        System.out.println("The number of years lapsed is:" + no_of_lapse +"\n");
        //2nd
        int average= no_of_lapse/len;
        float months=no_of_lapse%len;
        System.out.print("Approx years of release: "+ average +"years \t" + months +"months");
        //3rd
       Scanner input = new Scanner(System.in);
        System.out.println("\nEnter any episode of the movie and movie name will be displayed:");
        int num = input.nextInt();
        
        if (num>0 && num<9) {
        	System.out.println(movie_name[num-1]+"\n");
        }
       
        //4th
        
        System.out.println("Enter any episode of the movie and series number will be displayed:");
        int movie_number = input.nextInt();
       switch(movie_number){
        	case 1: System.out.println("1st Movie");
        	        break;
        	case 2: System.out.println("2nd Movie");
	                break;
        	case 3: System.out.println("3rd Movie");
        	        break;
        	default: System.out.println("Invalid");
        	         break;
        }
       
        //5th
       
        int value=1;
        while(value>0) {
           System.out.println("\nEnter any chapter number of Harry Potter series:");
           int chapter = input.nextInt();
           if (chapter>=1 && chapter<9) {
        	   System.out.println("\n The name of the movie is: "+ movie_name[chapter-1]+"\n");
           }
           else {
        	   break;
           }
        }
        input.close();
        //7th
        for(int i=0;i<len;i++) {
        	
        	movie_num[i]=i;
        	System.out.println(movie_num[i] + "," + movie_name[i] + "," + release_yr[i]);
        	
        }//End of for loop
        
	}//End of main

}//End of class
