import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParkerTest {
    @Test
    public void testParkWhenParkerHave1ParkingLotShouldSuccess() throws Exception {
        ParkingLot parkingLot = new ParkingLot(2);
        Car car = new Car();
        ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
        parkingLots.add(parkingLot);
        Parker parker = new Parker(parkingLots, new NormalParkingLotChooser());
        assertThat(parker.park(car), is(1));
    }

    @Test
    public void testParkWhenParkerHave2ParkingLotShouldSuccess() throws Exception {
        ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
        parkingLots.add(new ParkingLot(0));
        parkingLots.add(new ParkingLot(2));
        Car car = new Car();
        Parker parker = new Parker(parkingLots, new NormalParkingLotChooser());
        assertThat(parker.park(car), is(1));
    }
}
