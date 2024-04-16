package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CulcSummTest {

    @Test
    @DisplayName("Проверка сложения 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(2, 6);
        Assertions.assertEquals(8, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка сложения 2")
    @Timeout(10)
    @Tag("summ")
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(2, 6);
        Assertions.assertEquals(8, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName("Проверка сложения 3")
    @CsvSource({"2, 6, 8", "-2, 6, 4", "0, 0, 0"})
    @Tag("param")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}