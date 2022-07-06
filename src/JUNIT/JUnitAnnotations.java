package JUNIT;

import org.junit.*;

public class JUnitAnnotations {

    @BeforeClass
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("After all");
    }

    @Before
    public void before() {
        System.out.println("Before every test");
    }

    @After
    public void after() {
        System.out.println("After every test");
    }

    @Test
    public void test1() {
        System.out.println("I am the first test!");
        Assert.assertEquals(10,10);
    }

    @Test
    public void test2() {
        System.out.println("I am the second test!");
        Assert.assertEquals(5,6);
    }

}
