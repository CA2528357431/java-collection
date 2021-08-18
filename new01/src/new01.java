// arraylist 列表

import java.util.ArrayList;
import java.util.Collection;

public class new01 {
    public static void main(String[] args){

        Collection<Integer> c = new ArrayList<>();
        // <>指定数据类型
        // 必须是高级类型，int不可

        // 只能用collection的方法，根据index删除别想了，压根没有index


        c.add(9);
        c.add(3);
        c.add(6);
        c.add(5);
        c.add(4);
        c.add(2);
        System.out.println(c);
        // 添加指定对象

        c.remove(3);
        System.out.println(c);
        // 删除指定对象

        c.remove(3);
        System.out.println(c);
        // 若无目标对象，则无变化

        Collection<Integer> temp = new ArrayList<>();
        temp.add(9);
        temp.add(6);
        c.removeAll(temp);
        System.out.println(c);
        // 删除dele中所有

        c.addAll(temp);
        System.out.println(c);
        // 添加dele中所有

        int size = c.size();
        System.out.println(size);
        // 大小

        boolean judge = c.contains(9);
        System.out.println(judge);
        // 是否有

        boolean judgecol = c.containsAll(temp);
        System.out.println(judgecol);
        // 是否有全部



    }
}
