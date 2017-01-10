import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by toonew on 2017/1/11.
 */
@RunWith(Parameterized.class)
public class ParameterTest {

    /*
     1:更改默认的测试运行器为 Parameterized.class
     2:声明变量来存放预期值
     3:声明一个返回值为Collection的公共静态方法 并用@Parameterized 进行修饰
     4：为测试类声明一个带有参数的公共构造器，并在其中为之声明变量赋值
      */

    private int expected = 0;
    private int input1 = 0;
    private int input2 = 0;

    @Parameterized.Parameters
    public static Collection<Object[]> t() {
        return Arrays.asList(new Object[][]{
                {3, 1, 2}, {4, 2, 2}
        });
    }

    public ParameterTest(int expected, int input1, int input2) {
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
    }

    @Test
    public void testAdd() {
        assertEquals(expected, new Calc().add(input1, input2));
    }

}
