package com.example.abstraction;

	public class B extends A{
		public void write() {
			System.out.println("Writing novel");
		}
		public void read_p() {
			System.out.println("Reading poem");
		}
		public static void main(String[] args) {
			B b=new B();
			b.write();
			b.read_n();
		}
	}



