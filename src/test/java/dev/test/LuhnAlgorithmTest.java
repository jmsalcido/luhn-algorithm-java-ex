package dev.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LuhnAlgorithmTest {

    public static Stream<Arguments> test__check() {
        return Stream.of(
                Arguments.of("79927398713", true),
                Arguments.of("79927398712", false),
                Arguments.of("5346712135", true)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void test__check(String input, boolean solution) {
        // given
        LuhnAlgorithm instance = new LuhnAlgorithm();
        // when
        boolean actual = instance.check(input);
        // then
        assertEquals(solution, actual, "expected and actual value should be the same");
    }

}