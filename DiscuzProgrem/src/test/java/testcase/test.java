package testcase;

import org.testng.annotations.Test;
import pagehelper.HelperLoginPage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class test extends BasicTestCase {
   // 普通用户登录
    @Test
    public  void Login() {

        HelperLoginPage.Login(util,"test","testtest");
    }
    //管理员登录
  @Test
  public  void Login1() {
       HelperLoginPage.Login(util,"admin","password");
 }
    //普通用户自动登录
//    @Test
//    public  void AutoLogin() {
//        HelperLoginPage.inputUsername(util,"test");
//        HelperLoginPage.inputPassword(util,"testtest");
//        HelperLoginPage.clickAutoLogin(util);
//        HelperLoginPage.clickLogin(util);
//    }
    //管理员自动登录
//    @Test
//    public  void AutoLogin1() {
//        HelperLoginPage.inputUsername(util,"admin");
//        HelperLoginPage.inputPassword(util,"password");
//        HelperLoginPage.clickAutoLogin(util);
//        HelperLoginPage.clickLogin(util);
//    }
    //立即注册
//    @Test
//    public  void Register() {
//       HelperLoginPage.clickRegister(util);
//    }
//    //找回密码
//    @Test
//    public  void Retervepwd(){
//        HelperLoginPage.clickRetervepwd(util);
//    }
}
