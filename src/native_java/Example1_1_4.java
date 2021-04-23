package native_java;

import java.io.*;

public class Example1_1_4{
	public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

		double dblMoney;

		System.out.println("How much money do you have?");
		dblMoney = Double.parseDouble(key.readLine());

		if(dblMoney > 1300){
			System.out.println("Buy the new iPhone 12");
		}else if(dblMoney > 1000){
			System.out.println("Buy the new iPhone 12 mini");
		}else{
			System.out.println("Buy an iPhone SE");
		}
	}
}
