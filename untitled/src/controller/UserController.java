package controller;

import exception.UserException;
import model.user.User;
import service.UserService;

import static view.InputView.*;
import static view.OutputView.*;

public class UserController {
    private static final UserService userService = new UserService();

    public void signUp() throws UserException {
        printSignUpInit();
        String[] userInputs = inputLine().split(" ");
        validUserInput(userInputs, 3);

        User user = new User(userInputs[0], userInputs[1], userInputs[2]);
        userService.join(user);
        printSignUpResult(user.getName());
    }

    public User login() throws UserException {
        printLoginInit();
        String[] userInputs = inputLine().split(" ");
        validUserInput(userInputs, 2);
        User user = userService.login(userInputs[0], userInputs[1]);
        printLoginResult(user.getName());
        return user;
    }

    public void update(User currentUser) throws UserException {
        printUpdateInit();
        String[] userInputs = inputLine().split(" ");
        validUserInput(userInputs, 2);
        User updatedUser = new User(currentUser.getId(), userInputs[0], userInputs[1]);
        userService.update(updatedUser);
        printUpdateResult(updatedUser.getName());
    }

    public void deleteAccount(User currentUser) throws UserException {
        userService.remove(currentUser);
        printDeleteAccount(currentUser.getName());
    }

    private static void validUserInput(String[] userInputs, int num) throws UserException {
        if (userInputs.length != num) {
            throw new UserException("입력을 다시 확인해주세요.");
        }
    }

    public static void printSignUpInit() {
        printMessage("가입하실 이름과 아이디, 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
    }

    public static void printLoginInit() {
        printMessage("아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
    }

    public static void printUpdateInit() {
        printMessage("업데이트할 이름과 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
    }

    public static void printSignUpResult(String name) {
        printMessage(name + "님의 가입을 환영합니다.");
    }

    public static void printLoginResult(String name) {
        printMessage(name + "님 어서오세요.");
    }

    public static void printUpdateResult(String name) {
        printMessage(name + "님의 회원정보가 업데이트되었습니다.");
    }

    public static void printDeleteAccount(String name) {
        printMessage(name + "님의 정보가 제거되었습니다.");
    }


}
