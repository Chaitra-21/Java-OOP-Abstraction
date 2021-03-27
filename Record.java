package com.example.abstraction;

import java.util.Scanner;

public class Record implements Biodata {
	
	  public void p_details(){ 
		  System.out.println("Enter name age contact no: ");
		  @SuppressWarnings("resource")
		  Scanner sc= new Scanner(System.in); String name=sc.nextLine(); int
		  a=sc.nextInt(); long c=sc.nextLong();
		  System.out.println("Personal details are: ");
		  System.out.println("Name: "+name+" Age: "+a+" Contact no: "+c); }
	 
	public  void e_details() {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter clg name branch and per: ");
		String s=sc.nextLine();
		String b=sc.nextLine();
		double p=sc.nextDouble();
		sc.close();	
		System.out.println("Educational details are: ");
		System.out.println("College: "+s+" Percentage: "+p+" Branch: "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biodata b=new Record();
		b.p_details();
		b.e_details();
		
	}
}
