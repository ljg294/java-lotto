package step2.domain;

import java.util.Objects;

public class LottoNumber {

    private static final int MIN = 1;
    private static final int MAX = 45;

    private final int number;

    private LottoNumber(int number) {
        this.number = number;
    }

    public static LottoNumber of(int number) {
        validate(number);
        return new LottoNumber(number);
    }

    private static void validate(int number) {
        if (number < MIN || number > MAX) {
            throw new IllegalArgumentException("로또 번호는 1~45 사이의 숫자만 가능합니다.");
        }
    }

    public int number() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}