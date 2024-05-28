package RacingCar;

import java.util.Random;

public class Car {
    private static final Random random = new Random();
    private static final String ROUND_FINISH_FORMAT = "%s : %s";
    private static final int RANDOM_BOUNDARY = 10;
    private static final int MOVE_TRIGGER = 4;
    private final String name;
    public int moveSize;

    public Car(String name) {
        this.name = name;
        this.moveSize = 0;
    }

    public void move() {
        if (random.nextInt(RANDOM_BOUNDARY) >= MOVE_TRIGGER) {
            moveSize++;
        }
    }

    public String getMoveResult() {
        return ROUND_FINISH_FORMAT.formatted(this.name, this.moveSize);
    }

    public boolean isWinner(int winnerPosition) {
        return this.moveSize == winnerPosition;
    }

    public int getMoveSize() {
        return this.moveSize;
    }

    public String getName() {
        return this.name;
    }
}
