import org.junit.*;

/**
 * Created by Rain on 2017/1/10.
 */
public class JunitFlowTest {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("this is beforeClass...");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("this is beforeClass...");
    }

    @Before
    public void setUp() {
        System.out.println("this is beforeClass...");
    }

    @After
    public void tearDown() {
        System.out.println("this is beforeClass...");
    }

    @Test
    public void test1() {
        System.out.println("this is test1...");
    }

}
