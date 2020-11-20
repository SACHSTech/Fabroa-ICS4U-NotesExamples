# 1.1 Native Java

[Compiling and Running Java Programs](#compiling-and-running-java-programs)  
[System Input and Output](#system-input-and-output)
* [Output](#output)
* [Input](#input)
[Getting Numerical Input](#getting-numerical-input)
[File Input](#file-input)
[File Output](#file-output)






## Compiling and Running Java Programs
Running a java program is a two-step process consisting of compiling a program and then running it.

You write your source code in a `.java` file (i.e `MyProgram.java`), this must be compiled in order to run.  The output of the compilation process a `.class` file (i.e `MyProgram.class`).  It is the `.class` file that is run.

### Basic Example
Here, we compile the program in the terminal using `javac` and then run it using the `java` command.

```
javac MyProgram.java
java MyProgram
```

### `bin` and `src` directories
* It is a best practice to keep your source code (.java files) and compiled programs (.class files) in separate directories.  
* This makes it easier to maintain and clean up and also prevent accidental deletes of your source code.  
* It is common to keep source code in a `src` directory and compile to a `bin` directory

#### Example
```
javac -d bin src/package/subpackage/MyProgram.java
java -classpath bin package.subpackage.MyProgram
```

* In the compilation line, `-d bin` indicates that the destination of the resulting `.class` file to be a directory called `bin`. What follows is the file to compile including it's filepath within the `src` directory.
* In the execution line,  `-classpath bin` indicates that the program to be run is in the `bin` directory, what follows is the name of the program to run, including it's parent packages (folders) i.e `package.subpackage.MyProgram`

### Example1_1_1.java
Try compiling and running Example1_1_1.java  

```
javac -d bin src/unit1/Example1_1_1.java
java -classpath bin unit1.Example1_1_1
```

## System Input and Output
In grade 11, the ARC library was used to simplify keyboard input and screen output.  We will now move off the ARC library and utilize the input and output commands native to java.

### Example1_1_2.java

```
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
```

Consider the example above, let's breakdown what is happeing:

```
import java.io.*;
```
Instead of the arc library, we import all the methods of the `java.io` library, which contains the methods for input and output.

```
public static void main(String[] args) throws IOException{
```
`throws IOException` is now in the main method declaration.  If an error occurs due to input and output operations, the program will indicate that an error has occurred.  We will soon learn other ways to handle errors.

```
BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
```
Prepare to read from the keyboard by declaring a keyboard "object".  The `keyboard` variable will make availabe the methods to perform input.


### Output
```
System.out.println("What is your name?");
```
Prompt the user for information using the native **`System.out.println()`** method. This is the most common method to output text to the screen. Note that subsequent output or input after `println()` will occur on the following line.  `System.out.print()` (notice no `ln`) can be used when subsquent output or input is to occur immediatle after the text outputted by `System.out.print()` and not on a new line.


### Input

```
strName = keyboard.readLine();
```
 We then make a call to `keyboard.readLine()` which gets input from the keyboard and returns a string that is stored in `strName`.  In this case, the cursor for user input will be on the line after the `What is your name?` prompt.  Execution of these lines would look like this:
```

What is your name?
Eric
```

It is common to have the input cursor follow the prompt on the same line, instead of `System.out.println`, we can use `System.out.print` to do this:

```
System.out.print("Enter your name: ");
strName = keyboard.readLine();
```
A sample execution of this would be:

```
Enter your name: Eric
```

### Getting Numerical Input
`keyboard.readLine()` will return a string of what was keyed in.  If we want to get numerical data, we need to convert the input from string to a numerical datatype.

```
intAge = Integer.parseInt(keyboard.readLine());
```
Read from the keyboard and convert the resulting string into an integer data type.  See `Example1_1_3.java`
x
```
dblMoney = Double.parseDouble(key.readLine());
```
Read from the keyboard and convert the resulting string into an double data type.  See `Example1_1_4.java`


## File Input

```
BufferedReader thefile = new BufferedReader(new FileReader("youtube.txt"));
```
Prepare for reading strings from a text file.  `thefile` variable opens access to the the `readline()` method used to read the file.

```
thefile.close();
```
After you are done reading from the file, execute the close method to close the file and release it back to the operating system.

### Example1_1_5.java
```
import java.io.*;

public class native5{
	public static void main(String[] args) throws IOException{
		BufferedReader thefile = new BufferedReader(new FileReader("youtube.txt"));

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

```

```
strStuff = "";
while(strStuff != null){
        strStuff = thefile.readLine();
```
When you read a line from a text file, if you are at the bottom, the realLine method will return a null (“nothing”). You can then write an if statement or loop based on if you see a null or not.

## File Output

```
PrintWriter theout = new PrintWriter(new FileWriter("wutang.txt", true));
```
Open a file for writing.

```
theout.println("Colson");
```
See `Example1_1_6.java`
