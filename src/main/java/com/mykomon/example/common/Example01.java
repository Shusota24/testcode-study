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
}
