package baseball.view;

public class OutputView {

    public static void printMessage(Message message) {
        System.out.println(message.getMessage());
    } //print START, NOTHING, SUCCESS, END

    public static void printResult(String s, Message message) {
        System.out.println(s + message.getMessage());
    } //STRIKE, BALL

    public static void printBallAndStrike(String b, String s) {
        System.out.println(b + Message.BALL.getMessage() + " " + s + Message.STRIKE.getMessage());
    }
}
