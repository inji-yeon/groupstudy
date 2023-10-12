package Step01;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();

        int times = a * b;

        if(a>0 && a<10 && b>0 && b<10) {
            System.out.println("A-B = " + times);
        }
    }
}
