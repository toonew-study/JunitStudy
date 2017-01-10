import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rain on 2017/1/10.
 */
public class CalcTest {
    /**
     * Created by Administrator on 2015/5/29.
     * 1.测试方法上必须使用@Test进行修饰
     * 2.测试方法必须使用public void 进行修饰，不能待任何的参数
     * 3.新建一个源代码目录
     * 4.测试类的爆应该和被测试类保持一致
     * 5.测试单元中的每个方法必须可以独立测试，测试方法间不能有任何的依赖
     * 6.测试类使用Test作为类名的后缀
     * 7.测试方法使用test作为方法名的前缀
     */
    @Test
    public void testAdd() {
        assertEquals(6, new Calc().add(3, 3));
    }

    @Test
    public void testSub() {
        assertEquals(0, new Calc().sub(3, 3));
    }

    @Test
    public void testMul() {
        assertEquals(9, new Calc().mul(3, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(1, new Calc().divide(3, 3));
    }

}