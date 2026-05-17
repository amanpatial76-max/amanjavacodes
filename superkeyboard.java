public class superkeyboard {
    int a=10;
}

class Child extends superkeyboard {
    int a=20;

    void show() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.show();
    }
}  

