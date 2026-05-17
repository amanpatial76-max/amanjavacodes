public class largestelementinarray {
    class LargestArray {
    public static void main(String[] args) {
        int arr[]={2,8,1,9};
        int max=arr[0];
        for(int i:arr)
            if(i>max)
                max=i;
        System.out.println(max);
    }
}
}
