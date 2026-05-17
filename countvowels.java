public class countvowels {
 class Vowels {
    public static void main(String[] args) {
        String s="education";
        int count=0;
        for(char c:s.toCharArray()) {
            if("aeiou".indexOf(c)!=-1)
                count++;
        }
        System.out.println(count);
    }
}   
}
