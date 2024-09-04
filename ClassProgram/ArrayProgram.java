import java.util.Scanner;
class ArrayProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        int i,j;
        for(i=0,j=a.length-1;i<j;i++,j--){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("The Reverse order :");
        for(i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
