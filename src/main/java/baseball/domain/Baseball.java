package baseball.domain;

import baseball.exception.NumberException;

public class Baseball {

    private final String number;

    public Baseball(String number) {
        if (!checkNumberLength(number) || !checkIsNumber(number)) {
            throw new IllegalArgumentException(NumberException.INPUT_EXCEPTION.getMessage());
        }
        this.number = number;
    }

    public boolean checkNumberLength(String number) {
        return number.length() == 3;
    } //입력이 1에서 9가 아닐 경우, 입력이 3개가 아닌 경우

    public boolean checkIsNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    } //입력이 수가 아닐 경우
}
