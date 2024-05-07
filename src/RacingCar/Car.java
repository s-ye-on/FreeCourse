package RacingCar;
import java.util.Random;


public class Car {
    private static final Random random = new Random();

    private static final int RANDOM_BOUNDARY = 10;
    private static final int MOVE_TRIGGER = 4;
    private static final int START = 1;
    private static final String ROUND_FINISH_FORMAT = "%s : %s";

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position =0;
    }

    public int move() {
        if (random.nextInt(RANDOM_BOUNDARY) >= MOVE_TRIGGER) {
            position++;
        }

        return position;
    }

    public String showResult() {
        return ROUND_FINISH_FORMAT.formatted(this.name, this.position);
    }
}
