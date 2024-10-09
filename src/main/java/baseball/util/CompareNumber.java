package baseball.util;

public class CompareNumber {

    private final Integer strike;
    private final Integer ball;

    public CompareNumber(String userNumber, String computerNumber) {
        this.strike = calculateStrike(userNumber, computerNumber);
        this.ball = calculateBall(userNumber, computerNumber);
    }

    public Integer calculateStrike(String user, String computer) {
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (user.charAt(i) == computer.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    public Integer compareBall(String user, String computer) {
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (computer.contains(Character.toString(user.charAt(i)))) {
                cnt++;
            }
        }
        return cnt;
    }

    public Integer calculateBall(String user, String computer) {
        return compareBall(user, computer) - strike;
    }

    public Integer getStrike() {
        return strike;
    }

    public Integer getBall() {
        return ball;
    }
}
