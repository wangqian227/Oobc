import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ParkingLotTest {
    @Test
    public void shouldDecreaseOneLotWhenANewCarParkIn(){
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.acceptNewParkingCar(new Car());
        assertEquals(parkingLot.availableLots(), 9);

    }

    @Test
    public void shouldIncreaseOneLotWhenANewCarWalkAway(){
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();
        parkingLot.acceptNewParkingCar(car);
        parkingLot.parkingCarGoAway(car);
        assertEquals(parkingLot.availableLots(), 10);

    }

    @Test
    public void shouldNotLetCarParkInWhenNoLotIsAvailable(){
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.acceptNewParkingCar(new Car());
        assertEquals(parkingLot.availableLots(), 0);
        assertEquals(parkingLot.acceptNewParkingCar(new Car()), false);
    }

}



