package com.mykomon.example.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Example01クラスのテスト")
public class ExampleTest01 {

	@Nested
	@DisplayName("integerToString(Integer) のテスト")
	class IntegerToString {

		@Test
		@DisplayName("パラメータがnullの場合、空文字がreturnされること")
		void returnEmpty() {
			// 準備
			Integer testInteger = null;

			// 実行
			String result = Example01.integerToString(testInteger);

			// 確認
			assertEquals("", result);
		}

		@Test
		@DisplayName("パラメータがnullでない場合、文字列がreturnされること")
		void returnString() {
			// 準備
			Integer testInteger = 100;

			// 実行
			String result = Example01.integerToString(testInteger);

			// 確認
			assertEquals("100", result);
		}
	}

	@Nested
	@DisplayName("stringToInt(String) のテスト")
	class StringToInt {

		@ParameterizedTest
		@CsvSource({
			"1, 1",
			"01, 1",
			"-1, -1",
			"１, 1"
		})
		@DisplayName("数字文字列が正しくint型に変換されること")
		void returnExpectedWhenValidValue(final String value, final int expected) {

			// 実行
			int actualInt = Example01.stringToInt(value);

			// 確認
			assertEquals(expected, actualInt);
		}

		@ParameterizedTest
		@MethodSource("throwException_arguments")
		@DisplayName("変換不可のString入力の場合、Exceptionになること")
		void throwExceptionWhenInvalidValue(final String value) {

			// 実行、確認
			assertThrows(IllegalArgumentException.class, () -> Example01.stringToInt(value));
		}

		/**
		 * テストパターン引数（例外発生ケース）
		 *
		 * @return テストパターン引数
		 */
		static Stream<Arguments> throwException_arguments() {
			return Stream.of(
					Arguments.of("12.3"),
					Arguments.of("1,000"),
					Arguments.of("abc"),
					Arguments.of(""),
					Arguments.of((String) null));
		}
	}
}
