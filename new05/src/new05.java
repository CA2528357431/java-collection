import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class new05 {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);

        // 用迭代器或者for迭代的时候不能修改，会线程冲突

        // for(Integer x : li){
        //    System.out.println(x);
        //    if (x==3){
        //        li.add(333);
        //    }
        // }

        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
            if (li.get(i)==3){
                li.add(333);
            }
        }

        System.out.println();

        ListIterator<Integer> liit = li.listIterator();
        while (liit.hasNext()){
            int x = liit.next();
            System.out.println(x);
            if (x==3){
                liit.add(99999);
                // 在当前元素插入9999
                // 但本次遍历不到9999
            }
        }




    }
}
