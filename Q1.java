import java.util.Scanner;
class checker{
    void Multiply(int first,int second){
        try{
             if(first==0||second==0){
                throw new ArithmeticException("Atleast one of the numbers entered is 0");
             }
            int ans=first*second;
            System.out.println("The product is: "+ans);
        }catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
    }
    void Division(int first,int second){
        try{
            if(first==0||second==0){
               throw new ArithmeticException("Atleast one of the numbers entered is 0");
            }
            int ans=first/second;
            System.out.println("The quotient is: "+ans);
        }catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }
    }
}
public class Q1{
    public static void main(String args[]){
        checker c=new checker();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers to be multiplied: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        c.Multiply(a, b);
        System.out.print("Enter the numbers to be divided(dividend first): ");
        a=sc.nextInt();
        b=sc.nextInt();
        c.Division(a, b);
        sc.close();
    }
}