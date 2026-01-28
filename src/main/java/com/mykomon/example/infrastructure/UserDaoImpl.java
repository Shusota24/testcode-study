package com.mykomon.example.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mykomon.example.domain.User;

import lombok.NonNull;

public class UserDaoImpl implements UserDao {

	/** DBコネクション */
	@NonNull
	Connection con;

	@Override
	public UserDto findById(Long id) throws SQLException {

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
				UserDto dto =  UserDto.builder()
						.id(rs.getLong("id"))
						.name(rs.getString("name"))
						.age(rs.getInt("age"))
						.parentFilterFlag(rs.getBoolean("parent_filter_flag"))
						.build();
				return dto;
			}

			return null;
		}
	}

	@Override
	public void save(User user) {

	}

	@Override
	public void delete(Long id) {

	}
}
