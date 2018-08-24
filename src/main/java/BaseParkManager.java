import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseParkManager {

    public static List<ParkingLot> parkingLots = new ArrayList<>();

    static{
        for(int i = 0; i < 2 ; i++){
            ParkingLot parkingLot = new ParkingLot();
            parkingLot.setName("parking lot " + i);
            parkingLot.setMax_space(1);
            parkingLot.setCars(new HashMap<String,Car>());
            parkingLots.add(parkingLot);
        }
    }

    public static String park(Car car) {
       return null;
    }

    public static Car take(String carNO, String parkingLotName) {
        for(ParkingLot pl:parkingLots){
            if(pl.getName().equals(parkingLotName)){
                Car car = pl.getCars().get(carNO);
                pl.getCars().remove(car);
                return car;
            }
        }
        return null;
    }
}
