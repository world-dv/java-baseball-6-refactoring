package baseball.view;

public class OutputView {

    public void printMessage(String message) {
        System.out.println(message);
    } //print START, NOTHING, SUCCESS, END

    public void printStrike(String s) {
        System.out.println(s + Message.STRIKE);
    }

    public void printBall(String b) {
        System.out.println(b + Message.BALL);
    }

    public void printBallAndStrike(String b, String s) {
        System.out.println(b + Message.BALL + " " + s + Message.STRIKE);
    }
}
