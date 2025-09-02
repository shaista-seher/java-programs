import java.util.*;
class age{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your birth year:");
        int yr= sc.nextInt();
        System.out.println("your present age is:");
        int age=2025-yr;
        System.out.println(age);
    } 
}