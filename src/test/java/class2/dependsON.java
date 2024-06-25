package class2;

import org.testng.annotations.Test;

public class dependsON {
    @Test
    public void login() {
        System.out.println("i have looged in succesfully");
//        fail the test case
        //System.out.println(0 );
    }

    @Test
    public void verificationOfDashBoardPage() {

        System.out.println("i am on dashboard page");

    }
}
