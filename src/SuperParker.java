import java.util.ArrayList;

class SuperParkingLotChooser implements ParkingLotChooser {
public ParkingLot getParkingLotLa(ArrayList<ParkingLot> parkingLots) {
        double max = 0;
        ParkingLot parkingLotToPark = null;
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.availableLots() > max) {
                max = parkingLot.emptyRate();
                parkingLotToPark = parkingLot;
            }
        }
        return parkingLotToPark;
    }
}
