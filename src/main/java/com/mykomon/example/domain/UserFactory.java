package com.mykomon.example.domain;

/**
 * ユーザファクトリ
 */
public class UserFactory {

	/**
	 * 新しいUserインスタンスを作成します。
	 * IDはnullで初期化されます（新規作成時）。
	 *
	 * @param name ユーザーの名前
	 * @param age ユーザーの年齢
	 * @return Userインスタンス
	 */
	public static User createUser(String name, int age) {
		return User.builder()
				.id(null)
				.name(name)
				.age(age)
				.build();
	}

	/**
	 * IDが決まったUserインスタンスを作成します。
	 *
	 * @param id ユーザーのID
	 * @param name ユーザーの名前
	 * @param age ユーザーの年齢
	 * @return Userインスタンス
	 */
	public static User createUserWithId(Long id, String name, int age) {
		return User.builder()
				.id(id)
				.name(name)
				.age(age)
				.build();
	}
}
