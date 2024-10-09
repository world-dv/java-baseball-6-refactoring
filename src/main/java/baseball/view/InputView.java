package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputUser(Message message) {
        System.out.print(message.getMessage());
        return Console.readLine();
    }

    public static String inputEnd(Message message) {
        System.out.println(message.getMessage());
        return Console.readLine();
    }
}
