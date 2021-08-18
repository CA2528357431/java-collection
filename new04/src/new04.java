// 迭代器与遍历

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class new04 {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);


        ListIterator<Integer> it = li.listIterator();
        System.out.println(it.next());

        boolean ju = it.hasPrevious();
        System.out.println(ju);
        int x = it.previous();
        System.out.println(x);
        // 同next，hasnext





    }

}
