package view;

import domain.LottoStatistics;

public class ResultView {
    public static void printHowLottoCount(int count) {
        System.out.println(count + "개를 구매했습니다.");
    }

    public static void printLottoList(String result) {
        System.out.println(result);
    }

    public static void printStatistics(LottoStatistics lottoStatistics) {
        System.out.println("\n당첨 통계");
        System.out.println("---------------");
        System.out.println("3개 일치 (5000원) - " + (int) lottoStatistics.calculateNumbersCount(3) + "개");
        System.out.println("4개 일치 (50000원) - " + (int) lottoStatistics.calculateNumbersCount(4) + "개");
        System.out.println("5개 일치 (1500000원) - " + (int) lottoStatistics.calculateNumbersCount(5) + "개");
        System.out.println("6개 일치 (2000000000원) - " + (int) lottoStatistics.calculateNumbersCount(6) + "개");
        System.out.print("총 수익률은 " + lottoStatistics.statistics() + "입니다.");
    }

}