import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rain on 2017/1/10.
 */
public class ErrorAndFailureTest {
    /**

     * 1.Failure 一般由单元测试使用的方法判断失败所引起的，这表示测试点发现了问题，就是说问题输出的结果和我们预期的不一样。

     * 2.error是有代码异常引起的，它可以产生于测试代码本身的错误，也可以是测试代码中一个隐藏的bug

     * 3.测试用力不是用来证明你是对的，而是用来证明你没有错。

     */
    @Test
    public void testAdd() {
        assertEquals(5, new Calc().add(3, 3));
    }

    @Test
    public void testSub() {
        assertEquals(2, new Calc().sub(3, 3));
    }


}