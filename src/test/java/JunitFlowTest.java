import org.junit.*;

/**
 * Created by Rain on 2017/1/10.
 */
public class JunitFlowTest {

    /**
     * 1.@BeforeClass修饰的方法在所有的方法调用前被执行
     * 而且该方法是静态的，所以档测试类被加载后接着就会运行
     * 而且在内存中它只会存在一份实例，它比较适合加载配置文件。
     * 2.@AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库
     * 3.@Before 和 @After 会在这个测试方法的前后个执行一次
     */

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("this is beforeClass...");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("this is AfterClass...");
    }

    @Before
    public void setUp() {
        System.out.println("this is Before...");
    }

    @After
    public void tearDown() {
        System.out.println("this is After...");
    }

    @Test
    public void test1() {
        System.out.println("this is test1...");
    }

    @Test
    public void test2() {
        System.out.println("this is test2...");
    }

}
