package com.radioshack.util;

public class Adder {

	int MainArg1=-1;
	int MainArg2=-1;
	
	public Adder( int Arg1, int Arg2)
	{
		System.out.println("Inside Constructor");
		this.MainArg1=Arg1;
		this.MainArg2=Arg2;
	}

	public int Add()
	{
		System.out.println("Inside Add Method");
		return MainArg1+MainArg2;
	}
	
	public static void main(String[] args) {
		
		// to Test Add Function
		System.out.println("Inside Main Method");
		Adder objAdd = new Adder(100,50);
		
		System.out.println("Output of Addition "+objAdd.Add());
		
	}
	
	
}
