public class Pattern4 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
