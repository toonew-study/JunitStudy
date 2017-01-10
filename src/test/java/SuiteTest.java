import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by toonew on 2017/1/11.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class, TaskTest2.class, TaskTest3.class})
public class SuiteTest {
    /*
        1.测试套件就是组织测试类一起运行的
        2.写一个作为测试套件的入口类，这个类里不包含其他的方法。
        3.更改测试运行器Suite.class.
        4.将要测试的类作为数组传入到Suite.SuiteClasses({})
     */

}
