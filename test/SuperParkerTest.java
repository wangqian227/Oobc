import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SuperParkerTest {
    @Test
    public void testParkShouldParkToParkLotWithBestEmptyRate() throws Exception {
        ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

        ParkingLot parkingLotWithLowEmptyRate = new ParkingLot(10);
        for(int i=0;i<5;i++)parkingLotWithLowEmptyRate.acceptNewParkingCar(new Car());
        parkingLots.add(parkingLotWithLowEmptyRate);

        ParkingLot parkingLotWithHighEmptyRate = new ParkingLot(4);
        parkingLotWithHighEmptyRate.acceptNewParkingCar(new Car());
        parkingLots.add(parkingLotWithHighEmptyRate);

        Parker parker = new Parker(parkingLots, new SuperParkingLotChooser());

        assertThat(parker.park(new Car()), is(2));
    }
}
