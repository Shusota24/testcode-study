package com.mykomon.example.infrastructure;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
/**
 * ユーザDTO
 */
public class UserDto {

	/** ユーザID */
	Long id;

	/** 名前 */
	String name;

	/** 年齢 */
	Integer age;

	/** 保護者フィルタフラグ */
	Boolean parentFilterFlag;
}
