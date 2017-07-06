package debugSkill;

import java.util.ArrayList;
import java.util.List;

/**
 * 临时代码调试
 *
 * @author hapihapidoge
 * @create 2017-07-06 16:13
 */
public class CodeFragmentDebug {

    public static void main(String[] args) {

        List list = new ArrayList<String>();

        String obj = list.get(0).toString();//运行到该断点时，点击Debugger栏上的小计算器，编写临时代码

        System.out.println("obj = " + obj);

    }
}
