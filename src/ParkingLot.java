import java.util.ArrayList;

public class ParkingLot {
    private int account;  //the empty/all stall
    private ArrayList<Car> parkingCars;

    public ParkingLot(int account) {  //tell us the full empty stall
        parkingCars = new ArrayList<Car>(account);
        this.account = account;
    }

    public int availableLots() {
        return this.account;
    }

    public boolean acceptNewParkingCar(Car car) {
        if (account > 0 && car != null){
            parkingCars.add(car);
            account--;
            return true;
        }
        return false;
    }

    public boolean parkingCarGoAway(Car car) {
        if (parkingCars.remove(car)) {
            account++;
            return  true;
        }
        return false;
    }
}
