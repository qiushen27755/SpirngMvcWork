package pers.helen.ioc.service;

import pers.helen.ioc.UserDAO;
import pers.helen.ioc.UserDAOImpl;
import pers.helen.ioc.UserDAOMysql;

public class UserServiceImpl implements UserService{
	
//	private UserDAO userDao = new UserDAOImpl();
//	private UserDAO userDao = new UserDAOMysql();
	
	//原先使用new 定死了只能使用dao层 一个方法
	private UserDAO userDao;
	//改为set 之后 可以让用户自已选择实现
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public void getUser() {
		// TODO 自动生成的方法存根
		userDao.getUser();
	}

}
