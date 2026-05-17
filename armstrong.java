public class armstrong {
    class Armstrong {
    public static void main(String[] args) {
        int n=153,sum=0,temp=n;
        while(n!=0) {
            int r=n%10;
            sum+=r*r*r;
            n/=10;
        }
        if(temp==sum)
            System.out.println("Armstrong");
    }
}
}
