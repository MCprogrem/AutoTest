package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageLogin {
    //输入用户名
     public  static  final By LOGIN_TEXT_USERNAME=By.id("ls_username");
    //输入密码
    public  static  final  By LOGIN_TEXT_PASSWORD=By.id("ls_password");
    //登录按钮
    public  static  final  By LOGIN_BUTTON_LOGIN=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    //自动登录按钮
    public  static  final  By LOGIN_BUTTON_AUTOMATIC=By.name("cookietime");
  //立即注册
     public static  final By LOGIN_Link_REGISTER=By.linkText("立即注册");
    //找回密码
    public  static  final By LOGIN_LINK_RETERVEPWD=By.linkText("找回密码");


}
