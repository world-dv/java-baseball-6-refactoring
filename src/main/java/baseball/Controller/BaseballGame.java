package baseball.Controller;

import baseball.domain.Baseball;
import baseball.domain.ComputerBaseball;
import baseball.domain.NumberList;
import baseball.util.JudgmentResult;
import baseball.view.InputView;
import baseball.view.Message;
import baseball.view.OutputView;

public class BaseballGame {

    private final ComputerBaseball computerBaseball;
    private final NumberList numberList;

    public BaseballGame() {
        this.computerBaseball = new ComputerBaseball();
        this.numberList = new NumberList();
    }

    public void start() {
        while (true) {
            numberList.printNumberList();
            Baseball baseball = new Baseball(InputView.inputUser(Message.INPUT));
            JudgmentResult judgmentResult = new JudgmentResult(baseball.getNumber(), computerBaseball.getComputerNumber());

            deleteNumberList(baseball, judgmentResult);
            printResult(judgmentResult);
            if (end(judgmentResult)) {
                break;
            }
        }
    }

    public boolean end(JudgmentResult judgmentResult) {
        if (judgmentResult.judgmentOut()) {
            return true;
        }
        return false;
    }

    public void deleteNumberList(Baseball baseball, JudgmentResult judgmentResult) {
        if (judgmentResult.judgmentNothing()) {
            numberList.updateNumberList(baseball.getNumber());
        }
    }

    public void printResult(JudgmentResult judgmentResult) {
        printNothing(judgmentResult);
        printStrike(judgmentResult);
        printOut(judgmentResult);
        printBall(judgmentResult);
        printStrikeAndBall(judgmentResult);
    }

    public void printNothing(JudgmentResult judgmentResult) {
        if (judgmentResult.judgmentNothing()) {
            OutputView.printMessage(Message.NOTHING);
        }
    }

    public void printOut(JudgmentResult judgmentResult) {
        if (judgmentResult.judgmentOut()) {
            OutputView.printMessages(Message.SUCCESS, Message.END);
        }
    }

    public void printStrike(JudgmentResult judgmentResult) {
        if (judgmentResult.judgmentStrike()) {
            OutputView.printResult(judgmentResult.getStrike(), Message.STRIKE);
        }
    }

    public void printBall(JudgmentResult judgmentResult) {
        if (judgmentResult.judgmentBall()) {
            OutputView.printResult(judgmentResult.getBall(), Message.BALL);
        }
    }

    public void printStrikeAndBall(JudgmentResult judgmentResult) {
        if (judgmentResult.judgmentStrikeAndBall()) {
            OutputView.printBallAndStrike(judgmentResult.getBall(), Message.BALL, judgmentResult.getStrike(), Message.STRIKE);
        }
    }
}
