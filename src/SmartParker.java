import java.util.ArrayList;

class SmartParkingLotChooser implements ParkingLotChooser {
    public ParkingLot getParkingLotLa(ArrayList<ParkingLot> parkingLots) {
        int max = 0;
        ParkingLot parkingLotToPark = null;
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.availableLots() > max) {
                max = parkingLot.availableLots();
                parkingLotToPark = parkingLot;
            }
        }
        return parkingLotToPark;
    }
}
