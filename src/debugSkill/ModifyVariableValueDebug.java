package debugSkill;

/**
 * 修改变量值调试
 *
 * @author hapihapidoge
 * @create 2017-07-06 16:23
 */
public class ModifyVariableValueDebug {

    public static void main(String[] args) {

        int initVar = 1 ;

        for (int i = 0; i < 1; i++) {

            initVar = i + initVar;//运行到该断点时设置initVar = 10
        }

        System.out.println("initVar = " + initVar);
    }
}
