public class SmartParkingBoy extends BaseParkManager {


    public static String park(Car car) {
        int maxRemainingSpace = 0;
        ParkingLot parkingLot = null;
        for(ParkingLot pl: parkingLots){
            if (pl.remainingSpace() > maxRemainingSpace) {
                maxRemainingSpace = pl.remainingSpace();
                parkingLot = pl;
            }
        }
        if (maxRemainingSpace == 0){
            return null;
        }
        parkingLot.getCars().put(car.getCarNO(),car);
        return parkingLot.getName();
    }

}
