// linkhashset

// 遍历顺序取决于插入

// 相比于hashset，多了一个双向链表记录插入顺序，有利于遍历


import java.util.LinkedHashSet;
import java.util.Objects;

public class new11 {
    public static void main(String[] args){
        LinkedHashSet<per> ha = new LinkedHashSet<>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        per per = (per) o;
        return id == per.id && Objects.equals(name, per.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}