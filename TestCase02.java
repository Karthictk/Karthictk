package testngprograms;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase02 {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite Execution");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test Execution");
    }
    @Test(groups = {"ST"})
    public void tc03()
    {
        boolean bool=true;
        System.out.println("In TC03");
        Assert.assertTrue(bool);

    }

    @Test(groups = {"ST","RT"})
    public void tc04()
    {
        System.out.println("In TC04");
    }

}
