# Implementing TDD

## Objective
Consider the following problem that we want to apply TDD practices to:  

### `twoAsOne1`
> Write a method `twoAsOnetwoAsOne(int number1, int number2, int number3)`1Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
**Signature** `public boolean woAsOnetwoAsOne(int number1, int number2, int number3)`  

Examples
>> twoAsOne(1, 2, 3) → true  
twoAsOne(3, 1, 2) → true  
twoAsOne(3, 2, 2) → false  

## File Structure
We will have two files and one library.
1. `src/tdd/TDDExample.java` - our solution
2. `src/tdd/TDDExampleTest.java` - tests for our solution.  
3. `lib/junit-platform-console-standalone-1.7.0-M1.jar` - The JUnit library

### The JUnit Library
The testing suite we will be using is called `JUnit`. This contains the necessary tools to create and run our tests.  The `JUnit` library is in the `lib` folder in the form of a `.jar` file `junit-platform-console-standalone-1.7.0-M1.jar`.


### `TDDExampleTest.java`

#### Import Statements
First, you need to import the necessary classes from the `JUnit` library as well as the class we are testing.
```
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;

import tdd.TDDExample;
```

#### Class Definition
Define the class that will contain the test methods
```
public class TDDExampleTest {
```

#### @Before and @After Methods
We can define methods that will run before and test begins and after a test has run.  These are for performing any necessary steps that are necessary to setup a test (i.e open a file for reading/writing) or close a test (i.e close a file).  The before method is given an `@Before` tag and the after method is given an `@After` tag.  For now we will leave these alone.

```

  @Before
  public void SomeBeforeProcedures(){
      // code for your @After method
  }


  @After
  public void SomeAfterProcedures(){
      // code for your @After method
  }
```

#### @Test Method(s)
```
@Test
    public void Test1(){
        // make assertion statment(s)
    }
```
* All tests methods are give an @Test tag
* Return type is `void`
* You can define as many `@Test` methods as you need to.  


## Red-Green-Refactor

### 1. Red: Write a failing test.
Let's edit this `Test1` method with an assertion.
```
@Test
    public void Test1(){
        // make assertion statment(s)
        assertEquals(TDDExample.twoAsOne(1,2,3), true);
    }
```

#### Running the Test
First we complile TDDExample.java and TDDExampleTest.java
```
bash-3.2$ javac -d bin src/tdd/TDDExample.java
bash-3.2$ javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/tdd/TDDExampleTest.java
```

This results in a failure (at the compilation level):
```
src/tdd/TDDExampleTest.java:34: error: cannot find symbol
        assertEquals(TDDExample.twoAsOne(1,2,3), true);
                               ^
  symbol:   method twoAsOne(int,int,int)
  location: class TDDExample
1 error
```
This makes sense because we haven't defined our `twoAsOne` method yet.

### 2. GREEN - Make the Test Pass
Edit `TDDExample.java` just enough to pass the test.
```
public static boolean twoAsOne(int number1, int number2, int number3){
    return true;
  }
```

Now let's try compiline and running again
```
> javac -d bin src/tdd/TDDExample.java  
> javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/tdd/TDDExampleTest.java  
> java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c tdd.TDDExampleTest  
> java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c tdd.TDDExampleTest
```
Note, your can edit your `.replit` file to include in your run command
```
run = "javac -d bin src/tdd/TDDExample.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/tdd/TDDExampleTest.java; java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c tdd.TDDExampleTest 
```


This results in a passed test:
```
Test run finished after 109 ms
[         3 containers found      ]
[         0 containers skipped    ]
[         3 containers started    ]
[         0 containers aborted    ]
[         3 containers successful ]
[         0 containers failed     ]
[         1 tests found           ]
[         0 tests skipped         ]
[         1 tests started         ]
[         0 tests aborted         ]
[         1 tests successful      ]
[         0 tests failed          ]
```

### 3. REFACTOR
Now that we've passed the test, we can refactor our code to make it check for a proper condition
```
public static boolean twoAsOne(int number1, int number2, int number3){
    if (number1 + number2 == number3){
      return true;
    }

    return true;
  }
``` 
Recompiling and running the test still yields a successful test.  We can now move to another iteration of the cycle.
















