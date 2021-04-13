package kr.ac.konkuk;

public class Application {

    public static void main(String[] args) {
        StartView startView = new StartView();
        if(!startView.start_menu()){
            System.exit(2);
        }
        System.out.println("게밈 시작");
    }
}
