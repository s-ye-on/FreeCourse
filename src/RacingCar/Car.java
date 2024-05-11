package RacingCar;
public class Car {
    private final String name;
    public  String output;
    public int moveSize;
    Rule rule;

    public Car(String name) {
        this.name = name;
        output ="";
        moveSize =0;
    }

    public void move() {
        if (rule.moveRule()) {
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
}
