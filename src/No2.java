public class No2 {

    public static void main(String[] args) {
        System.out.println(ReverseString.Reverse("a b cd ef"));
        System.out.println(ReverseString.Reverse("contoh kalimat"));
    }
    public static No2 ReverseString;

    private static String Reverse(String dolphins){
        char raf[]=dolphins.toCharArray();
        String gogo="";
        for(int i=raf.length-1;i>-0;i--){
            gogo+=raf[i];
        }
return gogo.replaceAll("(?)[aiueo]","*");
    }
}

