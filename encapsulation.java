class Locker{
    private int pin = 1234;
    private boolean isOpen = false;
public void OpenLocker(int enteredipn) {
if (enteredpin == pin) {
    isOpen = true;
    System.out.println("locker opened");
} else {
    System.out.println("wrong PIN");
   }
}
public void checkStatus() {
    if (isOpen) {
        System.out.println("Locker is open ");
    }else {
        System.out.println("Locker is closed");
    }
    
}
public class main {
    public static void main(String[] args) {
        Locker A = new Locker();
        A.checkStatus();
        A.openLocker(enterdpin:1111);
        A.openLocker(enterdpin:1234);
        A.checKStstus();
       }
    }
}
