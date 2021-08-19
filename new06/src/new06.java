// arraylist
// 列表


import java.util.ArrayList;
import java.util.List;

public class new06 {
    public static void main(String[] args){
        ArrayList<Integer> li = new ArrayList<>();
        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        for(Integer x:li){
            System.out.println(x);
        }
    }
}
