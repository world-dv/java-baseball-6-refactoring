package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputUser(Message message) {
        System.out.println(message);
        return Console.readLine();
    } //INPUT, RESTART
}
