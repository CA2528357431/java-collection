// 链表

import java.util.ArrayList;
import java.util.LinkedList;

public class new07 {
    public static void main(String[] args){
        LinkedList<Integer> li = new LinkedList<>();
        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        for(Integer x:li){
            System.out.println(x);
        }

        int x = 996;
        li.addFirst(x);
        li.addLast(x);
        System.out.println(li);
        // 首尾add

        li.removeFirst();
        li.removeLast();
        System.out.println(li);
        // 首尾remove

        int f = li.getFirst();
        int l = li.getLast();
        System.out.println(f);
        System.out.println(l);
        // 首尾get


    }
}
