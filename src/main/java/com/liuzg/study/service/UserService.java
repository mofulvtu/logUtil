package com.liuzg.study.service;


import com.liuzg.study.domain.UserBean;

/**
 * Desc:
 * @author  liuzg
 * @date  2017/10/23
 */
public interface UserService {
	public UserBean Login(String user_name, String user_pwd);

	public void delete(int id);
}
