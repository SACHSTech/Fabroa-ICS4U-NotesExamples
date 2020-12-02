package tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;

import tdd.TDDExample;


public class TDDExampleTest {

    /**
     * An 'before' method is defined to perform any steps that need 
     * to be taken before a test is run i.e initialize a class, open a file.*/   
    @Before
    public void SomeBeforeProcedures(){
        // code for your @After method
    }

    /**
     * An 'after' method is defined to perform any steps that need to be taken after a test has run */   
    @After
    public void SomeAfterProcedures(){
        // code for your @After method
    }

    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statment(s)
        assertEquals(true, TDDExample.twoAsOne(1,2,3));
    }

    @Test
    public void Test2(){
      assertEquals(false, TDDExample.twoAsOne(2,2,3));
    }

    @Test
    public void Test3(){
        // make assertion statment(s)
        assertEquals(true, TDDExample.twoAsOne(3,2,1));
    }

    @Test
    public void Test4(){
        // make assertion statment(s)
        assertEquals(true, TDDExample.twoAsOne(2,3,1));
    }
 
    
}