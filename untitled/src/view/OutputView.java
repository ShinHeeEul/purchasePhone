package view;


import exception.UserException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputView {

    private static final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void printMessage(String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.flush();
        } catch(IOException e) {
            throw new UserException("출력에 문제가 발생했습니다.");
        }
    }
}
