package com.mykomon.example.application;

import com.mykomon.example.domain.User;
import com.mykomon.example.infrastructure.UserDto;

/**
 * ユーザマッパー
 */
public class UserMapper {

	/**
	 * エンティティ→DTO変換
	 */
	public static UserDto convertToDto(User user) {
		return UserDto.builder()
				.id(user.getId())
				.name(user.getName())
				.age(user.getAge())
				.parentFilterFlag(user.isParentFilterFlag())
				.build();
	}

	/**
	 * DTO→エンティティ変換
	 */
	public static User convertToEntity(UserDto userDto) {
		return User.builder()
				.id(userDto.getId())
				.name(userDto.getName())
				.age(userDto.getAge())
				.parentFilterFlag(userDto.getParentFilterFlag())
				.build();
	}
}
