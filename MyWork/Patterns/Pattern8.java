public class Pattern8 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*n+1)-2*i;j++){
                System.out.print("*");
            } 
            System.out.println();       
        }
    }
}
