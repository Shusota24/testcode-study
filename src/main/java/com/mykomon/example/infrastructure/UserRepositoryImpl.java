package com.mykomon.example.infrastructure;

import java.sql.SQLException;
import java.util.Optional;

import com.mykomon.example.application.UserMapper;
import com.mykomon.example.domain.User;

import lombok.NonNull;

/**
 * ユーザサービス
 */
public class UserRepositoryImpl {

	private final UserDao userDao;

	public UserRepositoryImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * IDでユーザを取得する。
	 *
	 * @param id ユーザID（null不可）
	 * @return ユーザが存在する場合は Optional.of(User)、存在しない場合は Optional.empty()
	 */
	public Optional<User> getUserById(@NonNull final Long id) throws SQLException {
		UserDto userDto = userDao.findById(id);

		if (userDto == null) {
			return Optional.empty();
		}

		User user = UserMapper.convertToEntity(userDto);

		return Optional.of(user);
	}

	/**
	 * ユーザを作成する。
	 *
	 * @param user ユーザ（null不可）
	 */
	public void createUser(User user) {
	}

	/**
	 * ユーザを削除する。
	 *
	 * @param id ユーザID（null不可）
	 */
	public void deleteUser(Long id) {
	}
}
