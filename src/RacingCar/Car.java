package RacingCar;
import java.util.Random;


public class Car {

    Random random = new Random();
    private final String Name;
    private int position = 0;
    static int carCount =0;

    public Car(String Name){
        ++carCount;
        this.Name = Name;
        position =0;
    }

    public int move(){
        int command = random.nextInt(10);
        if(command >= 4){
            position++;
        }
        return position;
    }

    public void showResults(){
            System.out.println("실행 결과");
            System.out.println(Name + ": " + position * '-');
    }

}
