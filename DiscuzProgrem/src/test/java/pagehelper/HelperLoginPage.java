package pagehelper;

import page.PageLogin;
import util.SeleniumUtil;
import org.apache.log4j.Logger;

/**
 * Created by lenovo on 2018/5/7.
 */
public class HelperLoginPage {

   public static Logger logger=Logger.getLogger(HelperLoginPage.class);

  //输入用户名
   public  static  void inputUsername(SeleniumUtil util,String username){
      util.sendKeys(PageLogin.LOGIN_TEXT_USERNAME,username);
   }
   //输入密码
   public  static  void  inputPassword(SeleniumUtil util,String password){
       util.sendKeys(PageLogin.LOGIN_TEXT_PASSWORD,password);
   }
   //登录按钮
   public static void  clickLogin(SeleniumUtil util){
      util.click(PageLogin.LOGIN_BUTTON_LOGIN);
   }
   //自动登录
   public  static  void  clickAutoLogin(SeleniumUtil util){
      util.click(PageLogin.LOGIN_BUTTON_AUTOMATIC);
   }
   //立即注册
   public static  void clickRegister(SeleniumUtil util){
      util.click(PageLogin.LOGIN_Link_REGISTER);
   }
   //找回密码
   public  static  void  clickRetervepwd(SeleniumUtil util){
      util.click(PageLogin.LOGIN_LINK_RETERVEPWD);
   }
   //重构一个登录方法
    public  static  void Login(SeleniumUtil util ,String username,String password){
         inputUsername(util,username);
         inputPassword(util,password);
         clickLogin(util);
    }
}
