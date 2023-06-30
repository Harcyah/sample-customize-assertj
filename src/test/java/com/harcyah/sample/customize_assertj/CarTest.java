package com.harcyah.sample.customize_assertj;

import org.junit.jupiter.api.Test;

import static com.harcyah.sample.customize_assertj.Assertions.assertThat;

class CarTest {

    @Test
    void testCar() {
        Car car = new Car("Foo", "Bar");
        assertThat(car)
            .hasBrand("Foo")
            .hasModel("Bar");
    }

}
