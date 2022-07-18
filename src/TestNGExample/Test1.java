package TestNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void Login(){
        System.out.println("Hellow world");
    }

    @Test
    public void Login1(){
        int number1=5;
        int number2=5;
        System.out.println("123");
        Assert.assertEquals(number1,number2);
    }

    @Test
    public void Login2(){
        int number1=5;
        int number2=7;
        System.out.println("123");
        Assert.assertNotEquals(number1,number2);
    }


}
