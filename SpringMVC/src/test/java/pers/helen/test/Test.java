package pers.helen.test;

import pers.helen.ioc.UserDAOMysql;
import pers.helen.ioc.UserDAOOracle;
import pers.helen.ioc.exploer.UserDaoDB;
import pers.helen.ioc.service.UserService;
import pers.helen.ioc.service.UserServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		//接口类对象对象 需要强转一次
		UserService user=new UserServiceImpl();
		((UserServiceImpl) user).setUserDao(new UserDaoDB());
		//实现类对象不需要强转
		//UserServiceImpl user=new UserServiceImpl();
		//user.setUserDao(new UserDAOMysql());
  		//用户实际调用的是业务层,DAO层他们不需要接触
		user.getUser();
	}
}
