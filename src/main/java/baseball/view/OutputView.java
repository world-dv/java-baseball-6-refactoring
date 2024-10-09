package baseball.view;

public class OutputView {

    public void printMessage(String message) {
        System.out.println(message);
    } //print START, NOTHING, SUCCESS, END

    public void printResult(String s, String message) {
        System.out.println(s + message);
    } //STRIKE, BALL

    public void printBallAndStrike(String b, String s) {
        System.out.println(b + Message.BALL + " " + s + Message.STRIKE);
    }
}
