public class Parker {

    private ParkingLot parkingLot;

    public ParkingLot getParkingLot(){
        return this.parkingLot;
    }

    public int park(ParkingLot parkingLot, Car car) {
        parkingLot.acceptNewParkingCar(car);
        return parkingLot.availableLots();
    }
}
