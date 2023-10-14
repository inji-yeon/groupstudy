package Step01;

import java.util.Scanner;

public class question11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < 1 || a >= Math.pow(10, 12)) {
            System.out.println("1과 10^12 사이의 수를 입력해주세요.");
        } else if(b < 1 || b >= Math.pow(10, 12)) {
            System.out.println("1과 10^12 사이의 수를 입력해주세요.");
        } else if(c < 1 || c >= Math.pow(10, 12)) {
            System.out.println("1과 10^12 사이의 수를 입력해주세요.");
        } else {
            System.out.println(a+b+c);
        }

    }
}
