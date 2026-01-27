package com.mykomon.example.domain;

import java.sql.SQLException;
import java.util.Optional;

/**
 * ユーザリポジトリ
 */
public interface UserRepository {

	// 参照
	public Optional<User> getUserById(Long id) throws SQLException;

	// 登録
	public void createUser(User user);

	// 削除
	public void deleteUser(Long id);
}
