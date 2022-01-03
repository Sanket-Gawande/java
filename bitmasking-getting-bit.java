import java.util.*;

class GetBit{
    public static void main(String args[]){
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter position");
        int b = sc.nextInt();
        if((a & (01<<b)) > 0) System.out.println("1");
        else System.out.println("0");

    }
}