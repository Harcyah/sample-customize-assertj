package com.harcyah.sample.customize_assertj;

import org.junit.Test;

import java.awt.Color;

import static com.harcyah.sample.customize_assertj.Assertions.assertThat;

public class FruitTest {

    @Test
    public void testCar() {
        Fruit fruit = new Fruit("Foo", Color.RED);
        assertThat(fruit)
            .hasName("Foo")
            .hasColor(Color.RED);
    }

}
