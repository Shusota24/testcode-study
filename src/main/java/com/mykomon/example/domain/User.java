package com.mykomon.example.domain;

import lombok.Builder;
import lombok.Value;

/**
 * ユーザ
 */
@Value
@Builder
public class User {

	/** ID */
	private Long id;

	/** 名前 */
	private String name;

	/** 年齢 */
	private int age;

	/** 保護者フィルター */
	boolean parentFilterFlag;

	/**
	 * ユーザーが成人かどうかを判定する。
	 *
	 * @return true:18歳以上、false:それ以外
	 */
	public boolean isAdult() {
		return age >= 18;
	}

	/**
	 * ユーザのステータスを取得する。
	 *
	 * 保護者フィルターがtrue:"filtered"、false:"normal"
	 */
	public String getAccessType() {
		return parentFilterFlag ? "filtered" : "normal";
	}
}
