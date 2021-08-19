// treeset

// 二叉树实现排序

import java.util.TreeSet;

public class new12 {
    public static void main(String[] args){

        TreeSet<Integer> ha = new TreeSet<>();
        // 无参默认自然排序
        // 可对 数字 字符串 来自动排序


        ha.add(1);
        ha.add(2);
        ha.add(6);
        ha.add(4);
        ha.add(9);
        ha.add(3);
        ha.add(0);


        for (int p:ha){
            System.out.println(p);
        }

    }

}
