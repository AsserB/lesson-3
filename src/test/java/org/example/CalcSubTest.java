package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcSubTest {

    @Test
    @DisplayName("Проверка вычитания 1")
    @Timeout(10)
    @Tag("sub")
    void sub1() {
        Calc calc = new Calc();
        int result = calc.sub(2, 6);
        Assertions.assertEquals(-4, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка вычитания 2")
    @Timeout(10)
    @Tag("sub")
    void sub2() {
        Calc calc = new Calc();
        int result = calc.sub(2, 6);
        Assertions.assertEquals(-4, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - вычитания {0} и {1}, ожидаем {2}")
    @DisplayName("Проверка вычитания 3")
    @CsvSource({"2, 6, -4", "50, 6, 44", "0, 0, 0"})
    @Tag("param")
    void sub3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.sub(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}