// treeset

// 二叉树实现排序

import java.util.TreeSet;

public class new13 {
    public static void main(String[] args){

        TreeSet<per> ha = new TreeSet<>();
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

// 创建自然排序

class per implements Comparable<per>{

    int id;
    String name;

    per(int x, String na){
        this.id = x;
        this.name = na;
    }

    void say(){
        System.out.println("i'm "+id);
    }

    // 自定义比较

    // 结果是当前对象 - 前一个对象的

    @Override
    public int compareTo(per o) {
        int res = this.id-o.id;
        if (res == 0){
            res = this.name.compareTo(o.name);
        }

        return res;
    }
    // 先比age 再比name
}