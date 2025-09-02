import java.util.*;
class number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);    
        System.out.println("enter first number:");
        int a = sc.nextInt();
        
        System.out.println("enter second number:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("the first number is greater");
            System.out.println(a);
        }
        else{
            System.out.println("the second number is greater");
            System.out.println(b);
        }
    }
}