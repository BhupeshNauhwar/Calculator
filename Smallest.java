import java.util.Scanner;

public class Smallest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if (a>b) {
            System.out.println(b+ " is smaller then "+ a );            
        } else {
            System.out.println(a+ " is smaller then "+ b );
        }
    }
}