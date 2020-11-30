package unit1;

import java.io.*;

public class Example1_1_5{
	public static void main(String[] args) throws IOException{
		BufferedReader thefile = new BufferedReader(new FileReader("src/unit1/youtube.txt"));

		String strStuff;
		// If the readLine returns null... it is returning nothing
		// This is different than ""
		strStuff = "";

		while(strStuff != null){
			strStuff = thefile.readLine();
			if(strStuff != null){
				System.out.println("STUFF: "+strStuff);
			}
		}
		thefile.close();
	}
}
