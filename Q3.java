import java.util.*;
class calculator{
    int a,b;
    calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
}  
public class Q3 {
    static void Add(calculator obj){ 
        int sum=obj.a+obj.b;
        System.out.println("The sum is: "+sum);
    }
    static void Subtract(calculator obj){
        int difference=obj.a-obj.b;
        System.out.println("The difference is: "+difference);
    }
    static void Multiply(calculator obj){
        int product=obj.a*obj.b;
        System.out.println("The product is: "+product);
    }
    static void Division(calculator obj) {
        int quotient=obj.a/obj.b;
        System.out.println("The quoteint after division is: "+quotient);
   }

   public static int inputNum(){

    try{
        Scanner sc=new Scanner(System.in);
        int num=0;
        num=sc.nextInt();//for addition
        return num;
       }catch(InputMismatchException e){
        System.out.println("Please enter integer only");
       }
       return 0;
   }
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int a,b;
    //    try{ 
    //     System.out.print("Please enter numbers: ");
    //     a=sc.nextInt(); b=sc.nextInt(); //for addition 
        // calculator obj1=new calculator(a,b);
        // Add(obj1);
    //    }catch(InputMismatchException e){
    //     System.out.println("Please enter integer only");
    //    }
        a = inputNum();
        b = inputNum();
        calculator obj1=new calculator(.,b);
        Add(obj1);

        try{
        System.out.print("Please enter numbers: ");
        a=sc.nextInt(); b=sc.nextInt(); //for subtraction
        calculator obj2=new calculator(a,b);
        Subtract(obj2);
        }catch(InputMismatchException e){
            System.out.println("Please enter integer only");
           }
           finally{}

        try{
        System.out.print("Please enter numbers: ");
        a=sc.nextInt(); b=sc.nextInt(); //for multiplication
        calculator obj3=new calculator(a,b);
        Multiply(obj3);
        }catch(InputMismatchException e){
            System.out.println("Please enter integer only");
        }

        try{
        System.out.print("Please enter numbers: ");
        a=sc.nextInt(); b=sc.nextInt(); //for division
        calculator obj4=new calculator(a,b);
        Division(obj4);
        }catch(InputMismatchException e){
            System.out.println("Please enter integer only");
           }
        sc.close();  
    }
}