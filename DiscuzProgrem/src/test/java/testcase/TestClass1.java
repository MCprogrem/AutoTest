package testcase;

import org.testng.annotations.Test;
import pagehelper.HelperDefauleBlockPage;
import pagehelper.HelperLoginPage;
import pagehelper.HelperLogoutPage;
import pagehelper.HelperPostMessagePage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class TestClass1 extends  BasicTestCase {

    // 普通用户登录
    @Test
    public  void Login() throws InterruptedException {
        //输入用户名、密码并登录
        HelperLoginPage.Login(util,"test","testtest");
        Thread.sleep(2000);
        //点击并切换到默认板块
        HelperDefauleBlockPage.clickDefaultBlock(util);
        Thread.sleep(2000);
//        //点击发帖
//        HelperPostMessagePage.clickMessage(util);
//        Thread.sleep(2000);
//        //输入标题
//        HelperPostMessagePage.inputTitle(util,"山海经");
//        Thread.sleep(2000);
//        //输入内容
//
//        HelperPostMessagePage.inputContent(util,"精卫填海《山海经·北次三经》：再向北走二百里，有座山叫发鸠山，它的上面（有）很多柘树。在它（上面）有（一种）鸟，它的形状像乌鸦，（有）花纹的头，白色的喙（嘴），红色的脚，名叫精卫，它的名字自己叫（出来的）；（传说）这种(鸟)(是)炎帝的小女儿（的化身），名叫女娃。女娃到东海游泳，被溺死了，就不能返回（了），所以化为精卫（鸟）。（它）经常口衔西山（上）的树枝（和）石块，用来填塞到东海（里）。");
//        Thread.sleep(2000);
//        //点击发表按钮
//        HelperPostMessagePage.clickPost(util);
        //----------------------------------------快速发表
        //输入标题
        HelperPostMessagePage.inputSend(util,"山海经");
        //输入内容
        HelperPostMessagePage.inputSendContent(util,"精卫填海《山海经·北次三经》：再向北走二百里，有座山叫发鸠山，它的上面（有）很多柘树。在它（上面）有（一种）鸟");
       //发表
        Thread.sleep(2000);
        HelperPostMessagePage.clickPost(util);
      //退出按钮
        Thread.sleep(2000);
        HelperLogoutPage.clickLogout(util);
//        //普通用户登录
//        HelperLoginPage.Login(util,"test","testtest");

    }

}
