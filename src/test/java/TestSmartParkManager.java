import org.junit.Assert;
import org.junit.Test;

public class TestSmartParkManager {
    @Test
    public void should_return_parking_lot_1_when_park_a_car(){

        //Given
        Car car = new Car();
        car.setCarNO("粤C123456");
        SmartParkingBoy.park(car);

        Car car1 = new Car();
        car.setCarNO("粤C654321");


        //When
        String parkingLotName = SmartParkingBoy.park(car1);

        //Then
        Assert.assertNotNull(parkingLotName);
        Assert.assertEquals("parking lot 1", parkingLotName);
    }

    @Test
    public void should_return_null_when_park_car(){

        //Given

        Car car = new Car();
        car.setCarNO("粤C123456");
        Car car1 = new Car();
        car.setCarNO("粤C654321");
        SmartParkingBoy.park(car);
        SmartParkingBoy.park(car1);

        Car car2 = new Car();
        car.setCarNO("粤Cd459821");


        //When
        String parkingLotName = SmartParkingBoy.park(car2);

        //Then
        Assert.assertNull(parkingLotName);
    }


    @Test
    public void should_return_car_when_input_carNO_and_parkingLotName(){

        //Given
        String carNO = "粤C123456";
        Car car = new Car();
        car.setCarNO(carNO);
        String parkingLotName = SmartParkingBoy.park(car);

        //When
        Car retCar = SmartParkingBoy.take(carNO,parkingLotName);

        //Then
        Assert.assertNotNull(retCar);
        Assert.assertEquals(carNO, retCar.getCarNO());
    }

    @Test
    public void should_return_null_when_input_a_nonexistent_carNO(){

        //Given
        String carNO = "粤C123456";
        String parkingLotName = "parking lot 0";

        //When
        Car retCar = SmartParkingBoy.take(carNO,parkingLotName);

        //Then
        Assert.assertNull(retCar);
    }
}

