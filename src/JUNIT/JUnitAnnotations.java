package JUNIT;

import org.junit.*;

public class JUnitAnnotations {

    @BeforeClass
    public static void beforeAll() {
        System.out.println("Inainte de toate");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("Dupa toate");
    }

    @Before
    public void before() {
        System.out.println("Inainte de fiecare test");
    }

    @After
    public void after() {
        System.out.println("Dupa de fiecare test");
    }

    @Test
    public void test1() {
        System.out.println("Sunt test 1");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2() {
        System.out.println("Sunt test 1");
        Assert.assertEquals(1,2);
    }

}
