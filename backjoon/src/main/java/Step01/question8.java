package Step01;

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("불기 연도 : ");
        int year = sc.nextInt();

        if(year >= 1000 && year <= 3000) {
            System.out.println("서기 연도 : " + (year - 543));
        }
    }

}
