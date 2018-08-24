import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private String name;
    private int max_space = 10;
    private Map<String,Car> cars = new HashMap<String, Car>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax_space() {
        return max_space;
    }

    public void setMax_space(int max_space) {
        this.max_space = max_space;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    public boolean isFull(){
       return (cars.size() == max_space)? true : false;
    }

    public int remainingSpace(){
        return max_space-cars.size();
    }

}
