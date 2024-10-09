package baseball.view;

public class OutputView {

    public static void printMessage(Message message) {
        System.out.println(message.getMessage());
    } //print START, NOTHING, SUCCESS, END

    public static void printMessages(Message message1, Message message2) {
        System.out.println(message1.getMessage() + " " + message2.getMessage());
    }

    public static void printResult(String s, Message message) {
        System.out.println(s + message.getMessage());
    } //STRIKE, BALL

    public static void printBallAndStrike(String b, Message bMessage, String s, Message sMessage) {
        System.out.println(b + bMessage.getMessage() + " " + s + sMessage.getMessage());
    }
}
