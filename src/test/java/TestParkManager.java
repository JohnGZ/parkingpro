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
    public void should_return_message_success_when_take_a_car(){

        //Given
        Car car = new Car();
        car.setCarNO("粤C123456");
        ParkManager.park(car);

        //When
        String message = ParkManager.take(car);

        //Then
        Assert.assertEquals("success", message);
    }
}
