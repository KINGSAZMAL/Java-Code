import java.util.Scanner;
public class Propel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "4546793";
        String s1=""+s.charAt(0);
        System.out.println(s1);
        int j=0;
        for(int i = 1; i < s.length(); i++){
            if(s1.charAt(j)%2 != 0 && s.charAt(i)%2 != 0){
                s1= s1 + '-' + s.charAt(i);
                j++;
            }
            else if(s1.charAt(j)%2 == 0 && s.charAt(i)%2 == 0){
                s1 = s1 + '*' + s.charAt(i);
                j++;
            }
            else{
                s1 = s1 + s.charAt(i);
            }
            j++;
        }
    System.out.println(s1);
}
}