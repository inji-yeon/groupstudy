package Step01;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {

        String[] idData = {"joonas", "baekjoon", "inji", "dojacat", "arianagrande"};

        Scanner sc = new Scanner(System.in);
        System.out.print("id ; ");
        String id = sc.nextLine();

        // 알파벳 소문자인지
        //50자 이하인지

        boolean lower;
        boolean length;

        char[] carr = id.toCharArray();

        if (id.length() <= 50) {
            for (int i = 0; i < carr.length; i++) {
                if (Character.isUpperCase(carr[i])) {
                    System.out.println("알파벳 소문자만 입력해주세요");
                    break;
                } else {
                    for (int j = 0; j < idData.length; j++) {
                        if (id.equals(idData[j])) {
                            id = id + "??!";
                        } else {
                            id = id;
                        }
                    }
                }
            }
            System.out.println(id);
        } else {
            System.out.println("50자 이내의 id를 입력해주세요.");
        }
    }
}