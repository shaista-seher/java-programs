import java.util.*;
class area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        int r=sc.nextInt();
        float a=(22/7)*(r*r);
        System.out.println("area of the circle:");
        System.out.println(a);
    }
}