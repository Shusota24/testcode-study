package com.mykomon.example.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Example01TestCase {

	@Nested
	@DisplayName("integerToString(Integer) のテスト")
	class IntegerToString {

		@Test
		@DisplayName("パラメータがnullの場合、空文字がreturnされること")
		void returnEmpty() {
			// 準備

			// 実行

			// 確認
		}

		@Test
		@DisplayName("パラメータがnullでない場合、文字列がreturnされること")
		void returnString() {
			// 準備

			// 実行

			// 確認
		}
	}
}
