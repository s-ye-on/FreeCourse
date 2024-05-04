package RacingCar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class RacingCarTest {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        st = new StringTokenizer(br.readLine(),",");

        List<Car> CarList = new ArrayList<>();
        for(int i=0; i<st.countTokens(); i++){
            CarList.add(new Car(st.nextToken()));
        }

        System.out.println("시도할 회수는 몇회인가요?");
        int times = Integer.parseInt(br.readLine());

        for(Car car : CarList){
            car.move();
        }


        System.out.println("실행 결과");
        for(int i=0; i<times; i++){
            for(Car car : CarList){

            }
            sb.append("\n");
        }
    }
}
