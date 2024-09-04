import java.util.Scanner;

class PalindromeString{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="malayalam";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println(s1+" is Palindorme");
        }else{
            System.out.println(s1+" is not palindrome");
        }
    }
}
