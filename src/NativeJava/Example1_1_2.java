package NativeJava;

import java.io.*;

public class Example1_1_2{
	public static void main(String[] args) throws IOException{

		String strName;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What is your name?");
		strName = keyboard.readLine();

		System.out.println("Welcome to native java: "+strName);

	}
}