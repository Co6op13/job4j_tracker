package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {

    @Test
    public void whenException() {
        Fact test =  new  Fact();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    test.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less then 0");
    }

    @Test
    public void whenN3Fact6() {
        int n = 3;
        int expected = 6;
        Fact test = new Fact();
        int result =  test.calc(n);
        assertThat(result).isEqualTo(expected);
    }
}