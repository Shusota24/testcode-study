package com.mykomon.example.common;

public class Example01 {

	/**
	 * IntegerをStringに変換します。
	 *
	 * @param param
	 * @return String
	 */
	public static String integerToString(Integer param) {
		if (param == null) {
			return "";
		}

		return String.valueOf(param);
	}

	/**
	 * Stringをintに変換します。
	 *
	 * @param param 文字列
	 * @return int
	 */
	public static int stringToInt(String param) {

		try {
			return Integer.parseInt(param);

		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("数値ではありません。");
		}
	}

	/**
	 * Stringの入力値を奇数か偶数か判定します。
	 *
	 * @param param 文字列
	 * @return String
	 */
	public String returnOddOrEven(String param) {

		try {
			int i = Integer.parseInt(param);

			if (i % 2 == 0) {
				return "even";
			} else {
				return "odd";
			}

		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("数値ではありません。");
		}
	}
}
