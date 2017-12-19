package com.liuzg.study.dao;

import com.liuzg.study.domain.UserBean;
import org.apache.ibatis.annotations.*;

/**
 * Desc:
 * @author  liuzg
 * @date  2017/10/23
 */
public interface UserDao {

	/**
	 * 通过name和pwd查找用户
	 * @param user_name
	 * @param user_pwd
     * @return
     */
	@Select("select * from users where user_name=#{name} and user_pwd=#{pwd}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="username",column="user_name",javaType=String.class),
		@Result(property="userpwd",column="user_pwd",javaType=String.class),
		@Result(property="user_phone",column="user_phone",javaType=String.class),
		@Result(property="user_email",column="user_email",javaType=String.class),
		@Result(property="user_note",column="user_note",javaType=String.class)
	})
	public UserBean login(@Param("name") String user_name, @Param("pwd") String user_pwd);


	/**
	 * 通过id删除用户
	 * @param id
	 * @return
	 * @throws Exception
     */
	@Delete("delete from users where id=#{id}")
	public int delUser(int id) throws Exception;
}
