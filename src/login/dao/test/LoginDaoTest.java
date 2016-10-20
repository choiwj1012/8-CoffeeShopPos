package login.dao.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import admin.vo.Admin;
import login.dao.LoginDao;
import login.repository.LoginRepository;
import mainController.MainController;

public class LoginDaoTest {

	MainController mainController;
	LoginDao loginDao;
	Admin admin;
	
	@Before
	public void setUp() throws Exception {
			
		mainController = new MainController();
		loginDao = new LoginDao();
		admin = new Admin();
		
	}

	
	@Test
	public void login_SUCCESS_Test() {
		
		admin.setAdminId("admin1");
		admin.setAdminPassword("admin1");
		admin.setAdminNumber(1);
		Admin loginAdmin = loginDao.Login(admin);
		assertNotNull("loginSuccess", loginAdmin);
		
	}
	
	@Test
	public void login_FAIL_Test(){
		
		admin.setAdminId("NotUser");
		admin.setAdminPassword("NotUser");
		admin.setAdminNumber(10);
		Admin loginAdmin = loginDao.Login(admin);
		assertEquals(null, loginAdmin);
		
	}
	
	
	@Test
	public void LoginRepo_SUCCESS_Test(){
		
		admin.setAdminId("admin1");
		admin.setAdminPassword("admin1");
		admin.setAdminNumber(1);
		
		loginDao.LoginRepo(admin);
		assertEquals(admin.getAdminId(), LoginRepository.getLoginAdminId());
				
	}
	
	
	@Test
	public void Logout_SUCCESS_Test(){
		
		loginDao.Logout();
		String userId = LoginRepository.getLoginAdminId();
		assertEquals(null, userId);
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		
	}

}
