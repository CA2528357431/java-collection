// hashcode
// 根据各种信息推出的int
// 对象都有

public class new09 {
    public static void main(String[] args){
        per p1 = new per(100);
        per p2 = new per(15);
        per p3 = p1;

        int h1 = p1.hashCode();
        int h2 = p2.hashCode();
        int h3 = p3.hashCode();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        // p3 p1 是同对象
        // p2 不同


    }
}

class per{

    int id;

    per(int x){
        this.id = x;
    }

    void say(){
        System.out.println("i'm "+id);
    }

}