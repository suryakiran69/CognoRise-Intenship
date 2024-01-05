import java.util.*;
class task{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        a=r.nextInt(50);
        System.out.println("Enter the number between 0 to 50 \n");
        System.out.println("You have 5 chances ");
        for(int i=0;i<5;i++){
            System.out.print("Enter the number: ");
            try{
                b=sc.nextInt();
            }
            catch(Exception e){
                System.out.println("Enter the correct data type: ");
                sc.nextInt();
                i--;
                continue;
            }
            if(a==b){
                System.out.println("Congarts you gussed the correct number");
                break;
            }
            if(a>b){
                System.out.println("The number is too less\n");
                System.out.println((4-i)+" chances left");
            }
            if(a<b){
                System.out.println("The number is too High\n");
                System.out.println((4-i)+" chances left");
            }
        }

    }
}