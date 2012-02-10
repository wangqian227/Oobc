import java.util.ArrayList;

public class Parker {

    protected final ArrayList<ParkingLot> parkingLots;
    private ParkingLotChooser chooser;

    public Parker(ArrayList<ParkingLot> parkingLots, ParkingLotChooser chooser) {
        this.parkingLots = parkingLots;
        this.chooser = chooser;
    }

    public int park(Car car) {
        ParkingLot parkingLotToPark = chooser.getParkingLotLa(parkingLots);
        if (parkingLotToPark != null) {
            if ( parkingLotToPark.acceptNewParkingCar(car))return parkingLotToPark.availableLots();
        }

        return -1;
    }

}

class NormalParkingLotChooser implements ParkingLotChooser{
  public ParkingLot getParkingLotLa(ArrayList<ParkingLot> parkingLots) {
        ParkingLot parkingLotToPark = null;
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLotToPark == null && parkingLot.availableLots() > 0)
                parkingLotToPark = parkingLot;
        }
        return parkingLotToPark;
    }
}
