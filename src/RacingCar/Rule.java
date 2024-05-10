package RacingCar;

import java.util.List;

public class Rule {
    StringBuilder sb = new StringBuilder();
    Car carNo1 = new Car("temperate");
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
