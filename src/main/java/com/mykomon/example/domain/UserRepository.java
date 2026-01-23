package com.mykomon.example.domain;

import java.sql.SQLException;
import java.util.Optional;

/**
 * ユーザリポジトリ
 */
public interface UserRepository {

	// 参照
	Optional<User> findById(Long id) throws SQLException;

	// 登録
	void save(User user);

	// 削除
	void delete(Long id);
}
