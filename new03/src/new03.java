// list

// 这里只演示list特有

import java.util.ArrayList;
import java.util.List;

public class new03 {
    public static void main(String[] args){

        List<Integer> li = new ArrayList<>();


        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);

        System.out.println(li);


        li.add(3,9999);
        System.out.println(li);
        // 在特定index插入

        li.remove(1);
        System.out.println(li);
        // 删除index
        // index是int    list内是integer

        int num = li.get(5);
        System.out.println(num);
        // get

        li.set(5,10000);
        num = li.get(5);
        System.out.println(num);
        // 在特定index重设

        int ind = li.indexOf(9999);
        System.out.println(ind);
        // 获取对象index   无则-1





    }

}
