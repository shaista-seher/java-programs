import java.util.*;
class total_marks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject 1 marks:");
        int m1=sc.nextInt();
        System.out.println("enter subject 2 marks:");
        int m2=sc.nextInt();
        System.out.println("enter subject 3 marks:");
        int m3=sc.nextInt();
        int total_marks=m1+m2+m3;
        System.out.println("TOTAL MARKS:");
        System.out.println(total_marks);
        int avg=total_marks/3;
        System.out.println("AVERAGE MARKS:");
        System.out.println(avg);
        

    } 
}