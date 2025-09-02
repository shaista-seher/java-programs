import java.util.*;
public class wave{
    static void UnipolarNRZ(int[] data){
        System.out.println("unipolar NRZ encoding");
        for(int bit:data){
            if(bit==1){
                System.out.println("+1");
            }
            else{
                System.out.println("0");
            }
        }System.out.println();
    }
        
        static void PolarNRZ(int[] data){
        System.out.println("polar NRZ encoding");
        for(int bit:data){
            if(bit==1){
                System.out.println("+1");
            }
            else{
                System.out.println("-1");
            }
        }System.out.println();
    }
        static void Manchester(int[] data){
        System.out.println("manchester encoding");
        for(int bit:data){
            if(bit==1){
                System.out.println("+1,-1");
            }
            else{
                System.out.println("-1,+1");
            }
        }System.out.println();
    }
        static void differentialmanchester(int[] data){
        System.out.println("differential manchester encoding");
        int lasttransition=1;
        for(int bit:data){
            if(bit==1){
                System.out.println("-1,+1");
            }
            else{
                System.out.println(lasttransition==1?"+1,-1":"-1,+1");
            }//transition for 0
            lasttransition=lasttransition;
        }System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of bits");
        int n= sc.nextInt();
        int[] data=new int[n];
        System.out.println("entre the binary bits(0s and 1s):");
        for(int i=0;i<n;i++){
            data[i]=sc.nextInt();
        }
        System.out.println("choose a line coding technique:");
        System.out.println("1.unipolar nrz");
        System.out.println("2.polar nrz");
        System.out.println("3.manchester");
        System.out.println("4.differential manchester");
        System.out.println("enter your choice(1-4)");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                UnipolarNRZ(data);
                break;
            case 2:
                PolarNRZ(data);
                break;
            case 3:
                Manchester(data);
                break;
            case 4:
                differentialmanchester(data);
                break;
            default:
                System.out.println("enter the valid ecoding technique(1-4) ");                
        }sc.close();
    }
}