package testngprograms;

import org.testng.annotations.*;

public class TestCase01 {

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Inside Before Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Inside Before Method");
    }

    @Test(groups = "RT",priority = 1)
    public void tc01()
    {
        System.out.println("In TC01");
    }

    @Test(groups = "ST",priority = 0)
    public void tc02()
    {
        System.out.println("In TC02");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Inside After Method");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("Inside After Class");
    }

}

/*
 *@Test
 * @BeforeMethod
 * @AfterMethod
 * @BeforeClass
 * @AfterClass
 * @BeforeTest
 * @AfterTest
 * @BeforeSuite
 * @AfterSuite
 * @Dataprovider
 */

