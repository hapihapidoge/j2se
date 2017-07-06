package debugSkill;

import java.util.ArrayList;
import java.util.List;

/**
 * 回退调试
 *
 * @author liaoqiang
 * @create 2017-07-06 15:43
 */
public class DropFrameDebug {

    public static void main(String[] args) {

        List list = new ArrayList<String>();

        list.add("first");

        list.add("second");

        System.out.println(list);
    }
}
