public class MutilParkManager extends BaseParkManager{

    public static String park(Car car) {
        for(ParkingLot pl: parkingLots){
            if(!pl.isFull()){
                pl.getCars().put(car.getCarNO(),car);
                return pl.getName();
            }
        }
        return null;
    }

}
