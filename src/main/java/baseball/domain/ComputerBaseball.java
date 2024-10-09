package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class ComputerBaseball {

    private final String computerNumber;

    public ComputerBaseball() {
        this.computerNumber = createComputerNumber();
    }

    public String createComputerNumber() {
        Set<Integer> computer = new HashSet<>();
        while (computer.size() < 3) {
            computer.add(createRandomNumber());
        }
        return changeListToString(computer);
    }

    public Integer createRandomNumber() {
        return Randoms.pickNumberInRange(1, 9);
    }

    public String changeListToString(Set<Integer> list) {
        return list.toString().replaceAll("[^1-9]", "");
    }

    public String getComputerNumber() {
        return computerNumber;
    }
}
