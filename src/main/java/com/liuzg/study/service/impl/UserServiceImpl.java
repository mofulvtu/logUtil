package com.liuzg.study.service.impl;


import com.liuzg.study.dao.UserDao;
import com.liuzg.study.domain.UserBean;
import com.liuzg.study.filter.VariableContainer;
import com.liuzg.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserBean Login(String user_name, String user_pwd) {
		/**
		 * 获取线程对象
		 */
		System.out.println("ThreadName: " + Thread.currentThread().getName()
				+ "||  Get data:" + VariableContainer.getThreadInstance().toString());
		return userDao.login(user_name, user_pwd);
	}

	@Override
	public void delete(int id) {
		try {
			System.out.println("ThreadName: " + Thread.currentThread().getName()
					+ "||  Get data:" + VariableContainer.getThreadInstance().toString());
			userDao.delUser(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
