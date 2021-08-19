// set
// 集合

import java.util.HashSet;
import java.util.Set;

public class new07 {
    public static void main(String[] args){

        Set<Integer> li = new HashSet<>();
        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);

        li.remove(3);

        for(Integer x:li){
            System.out.println(x);
        }

        // 操作几乎和Collection一致


        li.add(7);
        li.add(7);
        for(Integer x:li){
            System.out.println(x);
        }
        // 无重复

    }

}
