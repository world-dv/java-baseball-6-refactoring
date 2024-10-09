package baseball;

import baseball.Controller.BaseballGame;
import baseball.domain.OutBaseball;
import baseball.view.InputView;
import baseball.view.Message;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView.printMessage(Message.START);

        while (true) {
            BaseballGame baseballGame = new BaseballGame();
            baseballGame.start();
            if (endGame()) {
                break;
            }
        }

        OutputView.printMessage(Message.END);
    }

    public static boolean endGame() {
        OutBaseball outBaseball = new OutBaseball(InputView.inputEnd(Message.RESTART));
        return outBaseball.checkRestart();
    }
}
