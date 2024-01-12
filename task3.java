import java.util.*;
class sk{
    double add(double a,double b){
        return (a+b);
    }
    double sub(double a,double b){
        return (a-b);
    }
    double mul(double a,double b){
        return (a*b);
    }
    double div(double a,double b){
        try{
            double c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println("Enter the correct data types ");
            return -1;
        }
    }
}
public class cal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean f=true;
        while(f){
            System.out.print("Enter the first number: ");
            double a=sc.nextDouble();
            System.out.print("Enter the second number: ");
            double b=sc.nextDouble();
            System.out.println("Choose an operation :\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            System.out.print("Enter the number respective to operation: ");
            int v=sc.nextInt();
            sk skw=new sk();
            switch (v) {
                case 1:
                   System.out.println("Addition of two numbers is "+skw.add(a,b));
                    break;
                case 2:
                   System.out.println("Subtraction of two number is "+skw.sub(a,b));
                   break;
                   case 3:
                   System.out.println("Multiplication of two numbers is "+skw.mul(a,b));
                   break;
                   case 4:
                   System.out.println("Division of two number is "+skw.div(a, b));
                   break;
                   case 5:
                   f=false;
                   break;  
                   default:
                   System.out.print("Choose one operation :");
                   sc.next();  
            }
        }
    }
}
