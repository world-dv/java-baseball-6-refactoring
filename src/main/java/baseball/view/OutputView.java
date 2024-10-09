package baseball.view;

public class OutputView {

    public static void printMessage(String message) {
        System.out.println(message);
    } //print START, NOTHING, SUCCESS, END

    public static void printResult(String s, String message) {
        System.out.println(s + message);
    } //STRIKE, BALL

    public static void printBallAndStrike(String b, String s) {
        System.out.println(b + Message.BALL + " " + s + Message.STRIKE);
    }
}
