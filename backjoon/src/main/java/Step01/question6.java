package Step01;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();

        if(a>=1 && a<=10000 && b>=1 && b<=10000) {
            System.out.println("A+B = " + (a+b));
            System.out.println("A-B = " + (a-b));
            System.out.println("A*B = " + (a*b));
            System.out.println("A/B = " + (a/b));
            System.out.println("A%B = " + (a%b));
        }
    }
}
