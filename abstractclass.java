public class abstractclass {
public static void main(String[] args) {}
}
class Rectangle extends abstractclass {
    void draw(){
        System.out.println("Drawing");
    }
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.draw();
    }
}
