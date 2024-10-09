package baseball.domain;

import baseball.exception.NumberException;

public class OutBaseball {

    private final String out;

    public OutBaseball(String out) {
        if (!checkIsNumber(out) || !checkNumberLength(out) || !checkIsNumber1Or2(out)) {
            throw new IllegalArgumentException(NumberException.END_INPUT_EXCEPTION.getMessage());
        }
        this.out = out;
    }

    public Boolean checkIsNumber(String out) {
        try {
            Integer.parseInt(out);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Boolean checkNumberLength(String out) {
        return out.length() == 1;
    }

    public Boolean checkIsNumber1Or2(String out) {
        return "12".contains(out);
    }

    public boolean checkRestart() {
        return out.equals("2");
    }
}
