import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int l=a;
        if (b>l) {
            l=b;
        }
        if (c>l) {
            l=c;
        }

        int s=a;
        if(b<s){
            s=b;
        }
        if(c<s){
            s=c;
        }
        if (a==b && b==c ) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Largest is "+l);
            System.out.println("Smallest is "+s);
        }
        

    }
}