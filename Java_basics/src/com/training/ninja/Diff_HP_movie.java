package com.training.ninja;

import java.util.Scanner;

public class Diff_HP_movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int movie_num[]=new int [8];
		Scanner input = new Scanner(System.in);
		int user_num[] = new int[5];
		String movie_name[]= {"Philosophers stone","Chamber of Secrets","Prisoner","Goblet of fire","Order of Phoenix","Half blood prince","Dethly Hallows-1","Deathly Hallows-2"};
        int release_yr[]= {2001,2002,2004,2005,2007,2009,2010,2011};
        for (int i=0;i<5;i++) {
           
           user_num[i]=input.nextInt();
           System.out.println("Elements at index "+ i + ":" + user_num[i]);
           
        }
        
        for (int item:user_num) {
        	System.out.println("The movie name for"+ item + "is:" + movie_name[item]);
        }
        
        

	}

}
