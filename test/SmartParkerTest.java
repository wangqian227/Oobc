import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SmartParkerTest {
    @Test
    public void testParkShouldParkInParkingLotWithMostAvailableLots() throws Exception {
        ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
        parkingLots.add(new ParkingLot(2));
        parkingLots.add(new ParkingLot(4));
        Parker smartParker = new Parker(parkingLots, new SmartParkingLotChooser());
        assertThat(smartParker.park(new Car()), is(3));
    }
}
