package view;

import exception.UserException;

import java.util.Scanner;

import static view.OutputView.printInputMessage;

public class InputView {


    public static String inputLine() {
        Scanner sc = new Scanner(System.in);
        printInputMessage();
        return sc.nextLine();
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        printInputMessage();
        if(!sc.hasNextInt()) {
            throw new UserException("정수를 넣어주세요.");
        }
        return sc.nextInt();
    }
}
