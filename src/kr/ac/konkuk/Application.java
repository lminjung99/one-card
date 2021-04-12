package kr.ac.konkuk;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        if(!start_menu()){
            System.exit(2);
        }
        System.out.println("게밈 시작");
    }

    public static boolean start_menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>게임을 시작하겠습니까? (Y/N)");
        System.out.print(">");
        String res = scanner.next();
        try {
            if (!isYes(res)) {
                System.out.println("게임 종료");
                return false;
            }
        } catch (ValueException e) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            start_menu();
        } finally {
            scanner.close();
        }
        return true;
    }

    public static boolean isYes(String res) throws ValueException {
        res = res.toLowerCase();
        if (res.equals("yes")
                || res.equals("y")
                || res.equals("예")
                || res.equals("ㅇ")) {
            return true;
        } else if (res.equals("no")
                || res.equals("n")
                || res.equals("아니오")
                || res.equals("ㄴ")){
            return false;
        }
        throw new ValueException("Value Error");
    }
}
