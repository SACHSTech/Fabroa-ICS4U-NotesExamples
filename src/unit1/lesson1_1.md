# 1.1 Native Java

```
Example
```



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







## Output

## Input

### Getting Numerical Input

#### Getting Integers

#### Getting Doubles

## File Input

