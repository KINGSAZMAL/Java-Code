

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int sp_count=0;
        int wrd_count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sp_count++;
            }
        }
        System.out.println("Space Count="+sp_count);
        wrd_count=sp_count+1;
        System.out.println("word Count="+wrd_count);

        String arr[]=new String[wrd_count];
        String str_temp="";
        int temp=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                arr[temp]=str_temp;
                str_temp="";
                temp++;
            }
            else{
                str_temp=str_temp+str.charAt(i);
            }
        }
        arr[temp]=str_temp;
        for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
        }
    }
    
}
