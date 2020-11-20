package unit1;

import java.io.*;

public class Example1_1_6{
	public static void main(String[] args) throws IOException{
		PrintWriter theout = new PrintWriter(new FileWriter("src/unit1/wutang.txt", true));
		theout.println("RZA");
		theout.println("GZA");
		theout.println("Inspectah Deck");
		theout.println("U-God");
		theout.println("Ghostface Killah");
		theout.println("Method Man");
		theout.println("Raekwon");
		theout.println("Masta Killa");
		theout.println("Cappadonna");
		theout.close();	
	}
}
