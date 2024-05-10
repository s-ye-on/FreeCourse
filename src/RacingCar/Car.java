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
    public  String output;
    public int moveSize;

    public Car(String name) {
        this.name = name;
        position =0;
        output ="";
        moveSize =0;
    }

    public void move() {
        position =0;
        if (random.nextInt(RANDOM_BOUNDARY) >= MOVE_TRIGGER) {
            position++;
            output += '-';
            moveSize++;
        }
    }
    public int showMoveSize(){
        return this.moveSize;
    }
    public String getCarName(){
        return this.name;
    }

    public String showResult() {
        return ROUND_FINISH_FORMAT.formatted(this.name, this.output);
    }
    public void setMoveSize(int moveSize){
        this.moveSize = moveSize;
    }
}
