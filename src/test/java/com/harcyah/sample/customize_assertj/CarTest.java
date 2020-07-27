package com.harcyah.sample.customize_assertj;

import org.junit.Test;

import static com.harcyah.sample.customize_assertj.Assertions.assertThat;

public class CarTest {

    @Test
    public void testCar() {
        Car car = new Car("Foo", "Bar");
        assertThat(car)
            .hasBrand("Foo")
            .hasModel("Bar");
    }

}
