import java.util.List;

public class Main {
	public static void main(String[] args) {
		int money = Input.getMoney();
		int howMany = Input.getHowMany(money);
		int howManyManual = Input.getHowManyManual();
		int howManyAuto = howMany - howManyManual;
		Lottos lottos = new Lottos(Lotto.createLottos(howManyManual, howManyAuto));
		Result.showMyLottos(lottos);
		List<Integer> luckyNumbers = Input.getLuckyNumber();
		int bonusNum = Input.getBonusNumber();
		List<Match> matches = lottos.createMatches(luckyNumbers, bonusNum);
		StatisticsSet statisticsSet = new StatisticsSet(Statistics.createStatisticsSet());
		Statistics.runCheckingMatchingTicketNum(statisticsSet, matches);
		Result.showMyStatistics(statisticsSet, money);
	}
}