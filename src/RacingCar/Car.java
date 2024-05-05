package RacingCar;
import java.util.Random;


public class Car {
    StringBuilder sb = new StringBuilder();

    Random random = new Random();
    private final String Name;
    private int position;
    static int carCount =0;
    private String output ="";

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

    public String showResults(){
        if(position >=1){
            sb.append('-');
        }
            return (Name + ": " + sb);

    }
    public String showWinner(){

        return "최종 우승자 : " + Name;
    }

}
