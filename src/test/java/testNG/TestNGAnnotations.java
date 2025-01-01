package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotations {
    public static void main(String[] args) {
        System.out.println("This is not TestNG annotation");
        TestNGAnnotations testNGAnnotations1 = new TestNGAnnotations();
        testNGAnnotations1.notATestNGMethod();
    }

    public void notATestNGMethod() {

        System.out.println("This is not TestNG annotation1");
    }

    @Test
    public void test() {

        System.out.println("TestNG 01");
    }

}
