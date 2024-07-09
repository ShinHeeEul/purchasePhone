package view;


public class OutputView {

    public static void printMenuInit() {
        System.out.println("1. 회원 가입 / 2. 로그인 / 3. 회원정보 수정 / 4. 탈퇴 / 0.종료");
    }

    public static void printInputMessage() {
        System.out.print("입력 : ");
    }

    public static void printSignUpInit() {
        System.out.println("가입하실 이름과 아이디, 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
    }

    public static void printLoginInit() {
        System.out.println("아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
    }

    public static void printUpdateInit() {
        System.out.println("업데이트할 이름과 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
    }

    public static void printSignUpResult(String name) {
        System.out.println(name + "님의 가입을 환영합니다.");
    }

    public static void printLoginResult(String name) {
        System.out.println(name + "님 어서오세요.");
    }

    public static void printUpdateResult(String name) {
        System.out.println(name + "님의 회원정보가 업데이트되었습니다.");
    }

    public static void printDeleteAccount(String name) {
        System.out.println(name + "님의 정보가 제거되었습니다.");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void print(String s) {
        System.out.println(s);
    }
}
