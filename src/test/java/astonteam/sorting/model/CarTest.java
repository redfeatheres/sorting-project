package astonteam.sorting.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void builderShouldCreateCarWithSpecifiedFields() {
        Car car = new CarBuilder()
                .setModel("Toyota Camry")
                .setProductionYear(2020)
                .setPower(150)
                .build();

        assertEquals("Toyota Camry", car.getModel());
        assertEquals(2020, car.getProductionYear());
        assertEquals(150, car.getPower());
    }
}