package testcase;

import org.testng.annotations.Test;
import pagehelper.HelperLoginPage;
import pagehelper.HelperLogoutPage;
import pagehelper.HelperSearchPage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class TestClass3 extends  BasicTestCase {
     @Test
    public    void  userSearch() throws InterruptedException {
         //用户登录
         HelperLoginPage.Login(util,"test","testtest");
         //定位到搜索框并输入内容
         Thread.sleep(2000);
         HelperSearchPage.inputContent(util,"山海经");
         //点击搜索按纽
         HelperSearchPage.clickSearchbtn(util);
         //跳转到帖子具体内容的按钮
         Thread.sleep(2000);
         HelperSearchPage.clickLink(util);
         HelperSearchPage.clickVerify(util,"山海经");
         HelperLogoutPage.clickLogout(util);
     }
}
