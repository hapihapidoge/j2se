package debugSkill;

/**
 * 条件断点调试
 *
 * @author hapihapidoge
 * @create 2017-07-06 15:57
 */
public class ConditionBreakPointDebug {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("for three !"); //此处条件断点设置i==3，当i=0,1,2的时候不会进入该断点，但程序依然会执行
        }
    }
}
