package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ComputerBaseball {

    private final String computerNumber;

    public ComputerBaseball() {
        this.computerNumber = createComputerNumber();
    }

    public String createComputerNumber() {
        LinkedHashSet<Integer> computer = new LinkedHashSet<>();
        while (computer.size() < 3) {
            computer.add(createRandomNumber());
        }
        return changeListToString(computer);
    }

    public Integer createRandomNumber() {
        return Randoms.pickNumberInRange(1, 9);
    }

    public String changeListToString(LinkedHashSet<Integer> list) {
        return list.toString().replaceAll("[^1-9]", "");
    }

    public String getComputerNumber() {
        return computerNumber;
    }
}
