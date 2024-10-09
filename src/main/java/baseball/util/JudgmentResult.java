package baseball.util;

public class JudgmentResult {

    private final CompareNumber compareNumber;

    public JudgmentResult(String user, String computer) {
        compareNumber = new CompareNumber(user, computer);
    }

    public boolean judgmentOut() {
        return compareNumber.getStrike() == 3;
    }

    public boolean judgmentNothing() {
        return compareNumber.getStrike() == 0 && compareNumber.getBall() == 0;
    }

    public boolean judgmentStrike() {
        return (0 < compareNumber.getStrike() && compareNumber.getStrike() < 3) && compareNumber.getBall() == 0;
    }

    public boolean judgmentBall() {
        return compareNumber.getStrike() == 0 && compareNumber.getBall() != 0;
    }

    public boolean judgmentStrikeAndBall() {
        return compareNumber.getStrike() > 0 && compareNumber.getBall() > 0;
    }

    public String getStrike() {
        return integerToString(compareNumber.getStrike());
    }

    public String getBall() {
        return integerToString(compareNumber.getBall());
    }

    public String integerToString(Integer n) {
        return String.valueOf(n);
    }
}
