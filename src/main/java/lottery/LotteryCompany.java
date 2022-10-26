package lottery;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LotteryCompany {

    static final int LOTTERY_PRICE = 1000;

    private static final List<LotteryNumber> LOTTERY_NUMBER_CANDIDATES = IntStream
            .rangeClosed(1, LotteryNumber.LOTTERY_NUM_MAX)
            .mapToObj(LotteryNumber::new)
            .collect(Collectors.toList());

    public static Lottery generateRandomLotteryNumbers() {
        Collections.shuffle(LOTTERY_NUMBER_CANDIDATES);
        return new Lottery(LOTTERY_NUMBER_CANDIDATES.subList(0, Lottery.LOTTERY_NUM_COUNT)
                .stream()
                .sorted()
                .collect(Collectors.toList()));
    }

    public static int getAvailablePurchaseLotteryCount(int cashAmount) {
        return cashAmount / LOTTERY_PRICE;
    }
}