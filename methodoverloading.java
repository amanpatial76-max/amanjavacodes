public class methodoverloading {
    class Overload {
    void add(int a,int b) {
        System.out.println(a+b);
    }

    void add(double a,double b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Overload o=new methodoverloading();
        o.add(2,3);
        o.add(2.5,3.5);
    }
}
}