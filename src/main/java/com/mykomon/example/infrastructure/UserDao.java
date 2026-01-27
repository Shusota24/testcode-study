package com.mykomon.example.infrastructure;

import java.sql.SQLException;

import com.mykomon.example.domain.User;

/**
 * ユーザリポジトリ
 */
public interface UserDao {

	// 参照
	UserDto findById(Long id) throws SQLException;

	// 登録
	void save(User user);

	// 削除
	void delete(Long id);
}
