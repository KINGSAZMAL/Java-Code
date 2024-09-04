import java.util.Scanner;

class Addition{
    int add(int a,int b){
        int c=a+b;
        return c;
    }
}

class Multiplicatio{
    int mul(int a,int b){
        int c=a*b;
        return c;
    }
}

class Subtraction{
    void sub(int a,int b){
        int c=b-a;
        System.out.println("Subtraction = "+c);
    }
}

class Division{
    int div(){
        int a=10;
        int b=2;
        int c=a/b;
        return c;
    }
}

class sample1 {
    public static void main(String[] args) {
        Addition a=new Addition();
        Multiplicatio m=new Multiplicatio();
        Subtraction s=new Subtraction();
        Division d=new Division();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int result1=m.mul(x,y);
        int result=a.add(x,y);
        s.sub(x,y);
        
        int result3=d.div();
        System.out.println("Division = "+result3);
        System.out.println("Addition = "+result);
        System.out.println("Multiplication = "+result1);
    }
}
