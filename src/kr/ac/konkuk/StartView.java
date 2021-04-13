package kr.ac.konkuk;

import java.util.Scanner;

public class StartView {
    public boolean start_menu() {
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

    public boolean isYes(String res) throws ValueException {
        switch (res.toLowerCase()) {
            case "yes": case "y": case "예": case "ㅇ":
                return true;
            case "no": case "n": case "아니오": case "ㄴ":
                return false;
            default:
                throw new ValueException("Value Error");
        }
    }
}
