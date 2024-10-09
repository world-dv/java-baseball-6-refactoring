package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class NumberList {

    private final List<String> numbers;

    public NumberList() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(changeIntegerToString(i));
        }
        this.numbers = numbers;
    }

    public String changeIntegerToString(int n) {
        return Integer.toString(n);
    }

    public String changeCharToString(Character c) {
        return Character.toString(c);
    }

    public void printNumberList() {
        System.out.println(numbers.toString().replaceAll("[^1-9]"," "));
    }

    public void updateNumberList(String nothing) {
        for (int i = 0; i < nothing.length(); i++) {
            String out_toString = changeCharToString(nothing.charAt(i));
            if (numbers.contains(out_toString)) {
                numbers.set(numbers.indexOf(out_toString), " ");
            }
        }
    }
}
