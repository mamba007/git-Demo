package com.Gaurav.Git.Git_Demo;

public class App {
	public void addData(String data) {
		System.out.println("In a addData Method" + data);
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome");
		}
	}
	
	public void addedMethod(){
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
