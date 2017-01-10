import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by toonew on 2017/1/11.
 */
public class AnotationTest {

    /*
     * @Test: 将一个 普通的方法修饰成为一个测试方法\
     *     @Test(expected=XX.class)
     *      @Test(timeout=毫秒)
     * @BeforeClass: 他会在所有的方法运行前被执行，static修饰
     * @AfterClass : 他会在所有方法运行结束后被执行，static修饰
     * @Before： :   会在每一个测试方法被运行前执行一次
     * @After :      会在每个测试方法被运行后执行一次
     * @Ignore :   所修饰的测试方法会被测试运行器忽略
     * @RunWith: : 可以修改测试运行器 org.junit.runner.Runner
     */

    @Test(expected = ArithmeticException.class)
    public void testAdd() {
        assertEquals(3, new Calc().add(1, 3));
    }

    @Test(timeout = 2000)
    public void testWhile() {
        while (true) {
            System.out.println("running forever..");
        }
    }

    @Test(timeout = 3000)
    public void testSleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Ignore("忽略")
    @Test(timeout = 3000)
    public void testIgnore() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
