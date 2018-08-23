import org.junit.Assert;
import org.junit.Test;

public class TestParkManager {


    @Test
    public void should_return_message_success_when_park_a_car(){

        //Given
        Car car = new Car();
        car.setCarNO("粤C123456");

        //When
        String message = ParkManager.park(car);

        //Then
        Assert.assertEquals("success", message);
    }

    @Test
    public void should_return_car_when_input_a_carNO(){

        //Given
        String carNO = "粤C123456";
        Car car = new Car();
        car.setCarNO(carNO);
        ParkManager.park(car);

        //When
        Car retCar = ParkManager.take(carNO);

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
