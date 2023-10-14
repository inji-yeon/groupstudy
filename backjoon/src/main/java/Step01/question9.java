package Step01;

import java.util.Scanner;

public class question9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();
        System.out.print("C : ");
        int c = sc.nextInt();

        System.out.println("(A+B)%C = " + ((a+b)%c));
        System.out.println("((A%C) + (B%C))%C = " + (((a%b) + (b%c))%c));
        System.out.println("(A×B)%C = " + ((a*b)%c));
        System.out.println("((A%C) × (B%C))%C = " + (((a%c) * (b%c))%c));
    }
}
