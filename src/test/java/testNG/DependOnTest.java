package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnTest {
    @Test()
    public void oLevel() {
        System.out.println("O/Levels");
        Assert.fail();
    }

    @Test(dependsOnMethods = "oLevel")
    public void aLevel() {
        System.out.println("A/Levels");
    }

    @Test(dependsOnMethods = {"oLevel", "aLevel"}, alwaysRun = true)
    public void campus() {

        System.out.println("campus");
    }
}