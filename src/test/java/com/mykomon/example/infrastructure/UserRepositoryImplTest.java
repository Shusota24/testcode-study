package com.mykomon.example.infrastructure;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.mykomon.example.domain.User;

public class UserRepositoryImplTest {

	@Nested
	@DisplayName("getUserById(Long)のテスト")
	class testGetUserById {

		@Test
		@DisplayName("正しくユーザ情報が取得できるかを確認")
		void returnUser_exists() throws SQLException {
			// 準備
			User expectedUser = User.builder()
							.id(1L)
							.name("Taro")
							.age(20)
							.parentFilterFlag(false)
							.build();

			// userRepository.findById(id)の振る舞いをモックで定義
			UserRepositoryImpl userRepositoryImpl = Mockito.mock(UserRepositoryImpl.class);
			when(userRepositoryImpl.getUserById(1L)).thenReturn(Optional.of(expectedUser));

			// 実行
			Optional<User> result = userRepositoryImpl.getUserById(1L);

			// 確認
			assertTrue(result.isPresent());
		}
	}
}
