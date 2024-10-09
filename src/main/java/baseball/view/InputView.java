package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String startGame() {
        System.out.println(Message.INPUT);
        return Console.readLine();
    }

    public String resetGame() {
        System.out.println(Message.RESTART);
        return Console.readLine();
    }
}
