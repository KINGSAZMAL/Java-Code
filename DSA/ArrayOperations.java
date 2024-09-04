
import java.util.Scanner;
class array{
    int n;
    int a[];
    Scanner sc=new Scanner(System.in);
    array(int n){
        this.n=n;
    }
void createArray(){
    a=new int[n];
}
void insertData(){
    
    System.out.println("Enter the Array Element: ");
    for(int i=0;i<=n-1;i++){
        a[i]=sc.nextInt();
    }
}
//Deletion of Array element
void delete(){
    System.out.println("Enter the element to be deleted:");
    int ele=sc.nextInt();
    int pos=-1;
    for(int i=0;i<n;i++){
        if(a[i]==ele){
            pos=i;
            break;
        }
    }
    if(pos>-1){
        int res[]=new int[n-1];
        int k=0;
        for(int i=0;i<n;i++){
            if(i==pos){
            continue;
            }
            res[k]=a[i];
            k++;
        }
        System.out.println("Array Element after Deletion :");
        for(int i=0;i<n-1;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    else{
        System.out.println("Element Not Found");
    }
}
//Array element Updation
void updateData(){
    System.out.println("Enter the postion where the replacement must happen");
    int pos=sc.nextInt();
    System.out.println("Enter the new Element:");
    int ele=sc.nextInt();
    a[pos]=ele;
    System.out.println("Array Elemnt after Upadte are:");
    for(int i=0;i<=n-1;i++){
        System.out.print(a[i]+" ");
    }
}
//array elemnt Searching
void searching(){
    System.out.println("Element to be Searched:");
    int ele=sc.nextInt();
    int pos=-1;
    for(int i=0;i<=n-1;i++){
        if(a[i]==ele){
            pos=i;
            break;
        }
    }
    if(pos>-1){
        System.out.println("Element is Found"+pos);
    }
    else
    {
        System.out.println("Element not Found");
    }
}

void display(){
    System.out.println("Array Elements are:");
    for(int i=0;i<=n-1;i++){
        System.out.print(a[i]+" ");
    }
}
}
class ArrayOperations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n=sc.nextInt();
        array a1=new array(n);
        a1.createArray();
        a1.insertData();
        System.out.println("Choose Options:");
        System.out.println("1.Delete \n2.Updaten \n3.Search \n4.Display");
        int c=sc.nextInt();
        switch (c) {
            case 1:
            a1.delete();
                break;
            case 2:
            a1.updateData();
                break;
            case 3:
            a1.searching();
                break;
            case 4:
            a1.display();
                break;
            default:
                System.out.println("Invalid Option");
        }
        

    }
}