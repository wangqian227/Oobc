import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList<Car> parkingCars;
    private final int space;

    public ParkingLot(int account) {  //tell us the full empty stall
        parkingCars = new ArrayList<Car>(account);
        this.space = account;
    }

    public int availableLots() {
        return space - parkingCars.size();
    }

    public boolean acceptNewParkingCar(Car car) {
        if (availableLots() > 0 && car != null){
            parkingCars.add(car);
            return true;
        }
        return false;
    }

    public boolean parkingCarGoAway(Car car) {
        return parkingCars.remove(car);
    }

    public double emptyRate() {
        return availableLots()/space;  //To change body of created methods use File | Settings | File Templates.
    }
}
