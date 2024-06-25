package class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
    //    writing down my first test case
    @Test  //Test annotation is used to indicate that this is a test case
    public void firstTestCase(){
        System.out.println("heyy! iam a first test case");
    }

    //    writing down another test case
    @Test(groups = "smoke")
    public void secondTestCase(){
        System.out.println("heyy! iam a second test case");
    }

    @Test
    public void thirdTestcase(){

        System.out.println("heyy! iam a third test case");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("heyy! I AM A BEFORE METHOD");
    }

    @AfterMethod
    public void afterMEthod(){
        System.out.println("heyy! I AM A AFTER METHOD");
    }
}
