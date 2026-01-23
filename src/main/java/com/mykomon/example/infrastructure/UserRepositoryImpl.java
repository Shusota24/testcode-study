package com.mykomon.example.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import com.mykomon.example.domain.User;
import com.mykomon.example.domain.UserRepository;

import lombok.NonNull;

public class UserRepositoryImpl implements UserRepository {

	/** DBコネクション */
	@NonNull
	Connection con;

	@Override
	public Optional<User> findById(Long id) throws SQLException {

		// SQL文生成
		final StringBuilder sbSql = new StringBuilder();
		sbSql.append("SELECT ");
		sbSql.append("	id ");
		sbSql.append("	, name ");
		sbSql.append("	, age ");
		sbSql.append("	, parent_filter_flag ");

		sbSql.append("FROM ");
		sbSql.append("	`test`.`User` ");

		try (final PreparedStatement psmt = this.con.prepareStatement(sbSql.toString())) {
			final ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				User user =  User.builder()
						.id(rs.getLong("id"))
						.name(rs.getString("name"))
						.age(rs.getInt("age"))
						.parentFilterFlag(rs.getBoolean("parent_filter_flag"))
						.build();

				return Optional.of(user);
			}
			return Optional.empty();
		}
	}

	@Override
	public void save(User user) {

	}

	// 削除
	public void delete(Long id) {

	}
}
