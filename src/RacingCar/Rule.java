package RacingCar;

import java.util.List;
import java.util.Random;
public class Rule {
    StringBuilder sb = new StringBuilder();
    private static final Random random = new Random();
    private static final int RANDOM_BOUNDARY = 10;
    private static final int MOVE_TRIGGER = 4;
    Car carNo1 = new Car("temperate");
    Car car;
    private static final String ROUND_FINISH_FORMAT = "%s : %s";
    public String showResult(Car car) {
        return ROUND_FINISH_FORMAT.formatted(car.getCarName(), car.output);
    }
    public static boolean moveRule(){
        boolean trigger = false;
        if(random.nextInt(RANDOM_BOUNDARY) >= MOVE_TRIGGER){
            trigger = true;
        }
        return trigger;
    }

    public void showWinner(List<Car> list) {

        list.add(carNo1);
        int first = 0;
        for(Car car : list){
            if(car.showMoveSize()>first){
                carNo1 = car;
                first = car.showMoveSize();
            }
        }
        sb.append(carNo1.getCarName());

        for(int i=0; i<list.size(); i++){
            Car cowinner = list.get(i);
            if(carNo1 == cowinner){
                continue;
            }
            if(first == cowinner.moveSize){
                sb.append(", "+ cowinner.getCarName());
            }
        }
        System.out.println("최종 우승자: " + sb);
    }
}
