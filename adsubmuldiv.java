import java.util.*;
class adsubmuldiv{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter value of a:");
        int a=sc.nextInt();
        System.out.println("enter value of b:");
        int b=sc.nextInt();
        n=a+b;
        System.out.println("addition");
        System.out.println(n);
        n=a-b;
        System.out.println("substraction");
        System.out.println(n);
        n=a*b;
        System.out.println("multiplication");
        System.out.println(n);
        if(b!=0){
            n=a/b;
            System.out.println("division");
            System.out.println(n);
        }
        else{
            System.out.println("zero division error");
        }
    }
}        