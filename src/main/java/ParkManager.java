import java.util.ArrayList;
import java.util.List;

public class ParkManager {

    private static int max_space = 10;
    private static List<Car> cars = new ArrayList<Car>();


    public static String park(Car car){

        if(cars.size()<max_space){
            cars.add(car);
            return "success";
        }
        return "fail";
    }


    public static String take(Car car) {
        int index = cars.indexOf(car);
        if (index != -1){
            cars.remove(car);
            return "success";
        }
        return "fail";
    }
}
