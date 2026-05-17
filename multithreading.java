public class multithreading {
    public void run() {
        System.out.println("Thread Running");
    }

    public static void main(String[] args) {
        Mythread t=new mythread();
        t.start();
    }
} 