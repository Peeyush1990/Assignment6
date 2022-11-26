import java.util.Scanner;
class checker1{
    void Add(int first,int second){
            try{
                if(first<0||second<0){
                    throw new ArithmeticException("Numbers should be positive");
                } 
                int ans=first+second;
              System.out.println("The sum is: "+ans);  
            }catch(ArithmeticException arithmeticException){
                System.out.println(arithmeticException);
            }   
    }
    void Subtract(int first,int second){
        try{
            if(first<0||second<0){
                throw new ArithmeticException("Numbers should be positive");
            } 
            int ans=first-second;
          System.out.println("The difference is: "+ans);
        }catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }
    }
}
public class Q2{
    public static void main(String args[]){
    checker1 obj=new checker1();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the numbers to be added: ");
    int a=sc.nextInt();
    int b=sc.nextInt();    
    obj.Add(a,b);
    System.out.print("Enter the numbers to be subtracted: ");
    a=sc.nextInt();
    b=sc.nextInt();    
    obj.Subtract(a,b);
    sc.close();
    } 
}