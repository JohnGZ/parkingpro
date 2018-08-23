import org.junit.Assert;
import org.junit.Test;

public class TestMutilParkManager {

    @Test
    public void should_return_parking_lot_0_when_park_a_car(){

        //Given
        Car car = new Car();
        car.setCarNO("粤C123456");

        //When
        String parkingLotName = MutilParkManager.park(car);

        //Then
        Assert.assertNotNull(parkingLotName);
        Assert.assertEquals("parking lot 0", parkingLotName);
    }

    @Test
    public void should_return_null_when_park_car(){

        //Given

        Car car = new Car();
        car.setCarNO("粤C123456");
        Car car1 = new Car();
        car.setCarNO("粤C654321");
        Car car2 = new Car();
        car.setCarNO("粤Cd459821");
        MutilParkManager.park(car);
        MutilParkManager.park(car1);

        //When
        String parkingLotName = MutilParkManager.park(car2);

        //Then
        Assert.assertNull(parkingLotName);
    }


    @Test
    public void should_return_car_when_input_carNO_and_parkingLotName(){

        //Given
        String carNO = "粤C123456";
        Car car = new Car();
        car.setCarNO(carNO);
        String parkingLotName = MutilParkManager.park(car);

        //When
        Car retCar = MutilParkManager.take(carNO,parkingLotName);

        //Then
        Assert.assertNotNull(retCar);
        Assert.assertEquals(carNO, retCar.getCarNO());
    }

    @Test
    public void should_return_null_when_input_a_nonexistent_carNO(){

        //Given
        String carNO = "粤C123456";

        //When
        Car retCar = ParkManager.take(carNO);

        //Then
        Assert.assertNull(retCar);
    }
}
