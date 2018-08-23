import java.util.ArrayList;
import java.util.List;

public class MutilParkManager {

    public static List<ParkingLot> parkingLots = new ArrayList<>();

    public static String park(Car car) {
        for(ParkingLot pl: parkingLots){
            if(!pl.isFull()){
                pl.getCars().put(car.getCarNO(),car);
                return pl.getName();
            }
        }
        return "fail";
    }


}
