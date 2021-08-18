import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class new02 {
    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();
        c.add(9);
        c.add(3);
        c.add(6);
        c.add(5);
        c.add(4);
        c.add(2);

        // 迭代
        Iterator<Integer> it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            // next 返回对象，后移游标
        }

        System.out.println();

        // 或者可以更优雅
        for (Integer x : c) {
            System.out.println(x);
        }

    }
}