import java.util.*;
class strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s=sc.nextLine();
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.replace('e','a'));
    }
    
}