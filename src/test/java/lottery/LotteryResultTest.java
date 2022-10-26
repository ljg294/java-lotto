package lottery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class LotteryResultTest {

    LotteryResult lotteryResult;

    @BeforeEach
    void setUp() {
        EnumMap<LotteryRank, Integer> winningCounts = new EnumMap<>(Map.of(
                LotteryRank.FIFTH, 2,
                LotteryRank.FIRST, 1,
                LotteryRank.NONE, 7
        ));
        lotteryResult = new LotteryResult(winningCounts, LotteryCompany.LOTTERY_PRICE);
    }


    @Test
    void getWinningCountOfRank() {
        assertThat(lotteryResult.getWinningCountOfRank(LotteryRank.FIFTH)).isEqualTo(2);
        assertThat(lotteryResult.getWinningCountOfRank(LotteryRank.FIRST)).isEqualTo(1);
    }

    @Test
    void getReturnRate() {
        assertThat(lotteryResult.getReturnRate()).isEqualTo(200001);
    }

}