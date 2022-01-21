package math.problems;

import org.junit.Assert;
import org.junit.Test;

import java.awt.peer.SystemTrayPeer;

public class UnitTestingMath {
   @Test
    public void testfactorial(){
       int currentResult=Factorial.factorialRecursion(5);
       int ExpectedResult=120;
       Assert.assertEquals(currentResult,ExpectedResult);
       System.out.println("test factorial with Recursion passed ");
   }
    @Test
    public void testfactorial1(){
        int currentResult=Factorial.factorialIteration(5);
        int ExpectedResult=120;
        Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println("test factorial with Iteration passed ");
    }
    @Test
    public void testFibonacci(){
        int currentResult=Fibonacci.fibonacci(40);
        int ExpectedResult=63245986+39088169;
       Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println("fi passed");
    }

}
