package native_java;

import java.io.*;

public class Example1_1_3 {
    public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

		int intAge;
		int intDays;

		System.out.println("How old are you?");
		intAge = Integer.parseInt(key.readLine());

		intDays = intAge * 365;

		System.out.println("You have been alive this many days: "+intDays);
	}
    
}
