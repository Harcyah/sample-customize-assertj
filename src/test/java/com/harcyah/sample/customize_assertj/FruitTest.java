package com.harcyah.sample.customize_assertj;

import org.junit.jupiter.api.Test;

import java.awt.Color;

import static com.harcyah.sample.customize_assertj.Assertions.assertThat;

class FruitTest {

    @Test
    public void testCar() {
        Fruit fruit = new Fruit("Foo", Color.RED);
        assertThat(fruit)
            .hasName("Foo")
            .hasColor(Color.RED);
    }

}
