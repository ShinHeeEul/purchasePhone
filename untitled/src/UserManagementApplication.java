import controller.UserController;
import exception.UserException;
import model.user.User;

import static view.InputView.inputInt;
import static view.OutputView.*;
import static view.OutputView.printMessage;

public class UserManagementApplication {
    private static User currentUser = null;
    private final static UserController userController = new UserController();

    public static void startApplication() {
        while(true) {
            try {
                if(!displayUserManagementMenu()) {
                    return;
                }
            } catch(UserException e) {
                printMessage(e.getMessage());
            } catch(Exception e) {
                logError(e);
            }
        }
    }

    private static void logError(Exception e) {
        printMessage("알 수 없는 에러가 발생했습니다.");
        e.fillInStackTrace();
    }

    private static boolean displayUserManagementMenu() throws UserException {
        printMenuInit();
        int val = inputInt();
        if (val == 1) {
            userController.signUp();
            return true;
        } else if (val == 2) {
            setCurrentUser(userController.login());
            return true;
        } else if (val == 3) {
            hasCurrentUser();
            userController.update(currentUser);
            return true;
        } else if (val == 4) {
            hasCurrentUser();
            userController.deleteAccount(currentUser);
            setCurrentUser(null);
            return true;
        } else if (val == 0) {
            return false;
        }
        //throw
        throw new UserException("유효한 값을 넣어주세요.");
    }

    private static void setCurrentUser(User user) {
        currentUser = user;
    }

    private static void hasCurrentUser() {
        if(currentUser == null) throw new UserException("로그인 상태가 아닙니다.");
    }
 }
