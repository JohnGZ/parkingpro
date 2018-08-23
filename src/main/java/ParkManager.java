
import java.util.HashMap;
import java.util.Map;

public class ParkManager {

    private static int max_space = 10;
    private static Map<String,Car> cars = new HashMap<String, Car>();


    public static String park(Car car){

        if(cars.size()<max_space){
            cars.put(car.getCarNO(),car);
            return "success";
        }
        return "fail";
    }


    public static Car take(String carNO) {
        Car car = cars.get(carNO);
        if (car != null){
            cars.remove(carNO);
            return car;
        }
        return null;
    }
}
