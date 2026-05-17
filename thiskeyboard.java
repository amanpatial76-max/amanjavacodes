public class thiskeyboard {
    int a;

    thiskeyboard(int a) {
        this.a=a;
    }

    void display() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        thiskeyboard t=new thiskeyboard(5);
        t.display();
    }
} 

