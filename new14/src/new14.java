// 比较器

import java.util.Comparator;
import java.util.TreeSet;

public class new14 {
    public static void main(String[] args){

        mycmp cmp = new mycmp();

        TreeSet<per> ha = new TreeSet<>(cmp);
        // 无参默认自然排序

        per p1 = new per(1,"ca");
        per p2 = new per(4,"hk");
        per p3 = new per(5,"mac");
        per p4 = new per(7,"us");
        per p5 = new per(9,"uk");
        per p6 = new per(3,"ca");
        per p7 = new per(1,"gl");

        ha.add(p1);
        ha.add(p2);
        ha.add(p3);
        ha.add(p4);
        ha.add(p5);
        ha.add(p6);
        ha.add(p7);


        for (per p:ha){
            System.out.println(p.id);
            System.out.println(p.name);
            System.out.println();
        }

    }

}


class per{

    int id;
    String name;

    per(int x, String na){
        this.id = x;
        this.name = na;
    }

    void say(){
        System.out.println("i'm "+id);
    }

}

// 比较器

class mycmp implements Comparator<per> {

    @Override
    public int compare(per o1, per o2) {

        int res = o1.id-o2.id;
        if (res==0){
            res = o1.name.compareTo(o2.name);
        }

        return res;
    }
}