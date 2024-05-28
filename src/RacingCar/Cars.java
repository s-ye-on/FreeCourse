package RacingCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] names) {
        this.cars = Arrays.stream(names)
                .map(Car::new)
                .toList();
    }

    public void run(int round) {
        System.out.println("실행 결과");

        for (int i = 0; i < round; i++) {
            for (Car car : cars) {
                car.move();
                System.out.println(car.getMoveResult());
            }
            System.out.println();
        }
    }

    public String getWinners() {
        int winnerMoveSize = cars.stream()
                .mapToInt(Car::getMoveSize)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.isWinner(winnerMoveSize))
                .map(Car::getName)
                .collect(Collectors.joining(", "));
    }
}
