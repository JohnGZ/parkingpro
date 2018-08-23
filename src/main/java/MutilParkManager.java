import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MutilParkManager {

    public static List<ParkingLot> parkingLots = new ArrayList<>();

    static{
        for(int i = 0; i < 3 ; i++){
            ParkingLot parkingLot = new ParkingLot();
            parkingLot.setName("parking lot " + i);
            parkingLot.setMax_space(1);
            parkingLot.setCars(new HashMap<String,Car>());
            parkingLots.add(parkingLot);
        }
    }

    public static String park(Car car) {
        for(ParkingLot pl: parkingLots){
            if(!pl.isFull()){
                pl.getCars().put(car.getCarNO(),car);
                return pl.getName();
            }
        }
        return null;
    }


    public static Car take(String carNO,String parkingLotName) {
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
