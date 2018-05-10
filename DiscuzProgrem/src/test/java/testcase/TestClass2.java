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
        HelperDeletePage.clickCeratin(util);
        //切换到管理中心
        HelperNewBlockPage.clickManagement(util);
        //输入密码
        HelperNewBlockPage.inputPassword(util,"password");
       //提交
        HelperNewBlockPage.clickSubmit(util);
        //论坛
        HelperNewBlockPage.clickForum(util);
        //添加新版块
        HelperNewBlockPage.clickAdd(util);
        //修改名称
        HelperNewBlockPage.alterName(util,"夏日");
        //设置继承关系
        HelperNewBlockPage.setInherit(util);
        //提交
        HelperNewBlockPage.clickSubmitbtn(util);
        //管理员退出添加版块页面
        HelperNewBlockPage.clickQuit(util);
        //管理员退出登录
        HelperLogoutPage.clickLogout(util);
        //普通用户登录
        HelperLoginPage.Login(util,"test","testtest");
        //打开新版本
        Thread.sleep(2000);
        HelperNewBlockPage.openNewBlock(util,1);
       //发表帖子
        HelperPostMessagePage.clickMessage(util);
        HelperPostMessagePage.inputTitle(util,"流年");
        HelperPostMessagePage.inputContent(util,"也无风雨也无晴");
        HelperPostMessagePage.clickPost(util);
        //回复帖子
       // HelperRepliesPage.clickCard(util);
       // Thread.sleep(2000);
       // HelperRepliesPage.clickReply(util);
        HelperRepliesPage.inputContents(util,"农夫山泉有点甜");
        HelperRepliesPage.clickBtn(util);
    }

}