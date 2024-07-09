package exception;

import java.util.Arrays;

public class UserException extends RuntimeException {

    public UserException(String message) {
        super("[Error] : " + message);
    }

}
