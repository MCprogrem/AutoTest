package testcase;

import org.testng.annotations.Test;
import org.w3c.dom.events.UIEvent;
import pagehelper.*;

/**
 * Created by lenovo on 2018/5/8.
 */
public class TestClass2 extends BasicTestCase {
    @Test
    public void userAction() throws InterruptedException {
        //管理员输入用户名、密码并登录
        HelperLoginPage.Login(util, "admin", "password");
        //进入 默认板块
        Thread.sleep(2000);
        HelperDefauleBlockPage.clickDefaultBlock(util);
        //选择帖子

        HelperDeletePage.clickContent(util);
        //删除按钮
        HelperDeletePage.clickDelete(util);
        //删除原因选择
       // HelperDeletePage.clickSelect(util);
        //输入删除原因
        HelperDeletePage.inputReason(util, "输入内容不合法");
        //确定按钮
        Thread.sleep(2000);
        HelperDeletePage.clickCeratin(util);
        //切换到管理中心
        HelperNewBlockPage.clickManagement(util);
        //输入密码
        HelperNewBlockPage.inputPassword(util,"password");
       //提交
        HelperNewBlockPage.clickSubmit(util);
        Thread.sleep(2000);
        //论坛
        HelperNewBlockPage.clickForum(util);
        //添加新版块
        Thread.sleep(5000);
        HelperNewBlockPage.clickAdd(util);
        //修改名称
        Thread.sleep(2000);
        HelperNewBlockPage.alterName(util,"夏日");
        //设置继承关系
        Thread.sleep(2000);
        HelperNewBlockPage.setInherit(util);
        //提交
        Thread.sleep(2000);
        HelperNewBlockPage.clickSubmitbtn(util);
        //管理员退出
        HelperNewBlockPage.clickQuit(util);
//        //打开新版本
//        Thread.sleep(2000);
//        HelperNewBlockPage.openNewBlock(util);
    }

}