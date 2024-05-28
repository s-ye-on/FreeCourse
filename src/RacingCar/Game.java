package RacingCar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void start() throws IOException {
        String[] players = recruitPlayers();

        int round = readRound();

        Cars cars = new Cars(players); // 일급 컬렉션 생성

        cars.run(round);

        announceWinners(cars);
    }

    private String[] recruitPlayers() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String input = br.readLine();
        Rule.validatePlayersInput(input);

        return input.split(",");
    }

    private int readRound() throws IOException {
        System.out.println("시도할 회수는 몇회인가요?");
        int round = Integer.parseInt(br.readLine());
        Rule.validateNaturalNumber(round);
        return round;
    }

    private void announceWinners(Cars cars) {
        String winners = cars.getWinners();
        System.out.println("최종 우승자 :" + winners);
    }
}
