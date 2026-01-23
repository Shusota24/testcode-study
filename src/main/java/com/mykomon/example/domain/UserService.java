package com.mykomon.example.domain;

import java.sql.SQLException;
import java.util.Optional;

/**
 * ユーザサービス
 */
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/**
	 * IDでユーザを取得する。
	 *
	 * @param id ユーザID（null不可）
	 * @return ユーザが存在する場合は Optional.of(User)、存在しない場合は Optional.empty()
	 */
	public Optional<User> getUserById(Long id) throws SQLException {
		return userRepository.findById(id);
	}

	public void createUser(User user) {
		userRepository.save(user);
	}

	public void deleteUser(Long id) {
		userRepository.delete(id);
	}
}
