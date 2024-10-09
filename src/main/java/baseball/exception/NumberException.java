package baseball.exception;

public enum NumberException {

    INPUT_EXCEPTION("1에서 9사이 중복되지 않는 정수만 입력해주세요.");

    private final String message;

    NumberException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
