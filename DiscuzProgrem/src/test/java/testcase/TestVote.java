package testcase;

import org.testng.annotations.Test;
import pagehelper.HelperLoginPage;
import pagehelper.HelperNewBlockPage;
import pagehelper.HelperPostMessagePage;
import pagehelper.HelperVotePage;

/**
 * Created by lenovo on 2018/5/9.
 */
public class TestVote extends  BasicTestCase {
    @Test
     public  void  vote()throws InterruptedException {
        //普通用户登录
        HelperLoginPage.Login(util,"test","testtest");
        //选择版块
        Thread.sleep(2000);
        HelperNewBlockPage.openNewBlock(util,2);
        //发表投票
        HelperPostMessagePage.clickMessage(util);
        HelperVotePage.ckickvote(util);
        //输入投票选项
        Thread.sleep(2000);
        HelperVotePage.inputVote(util, "城市好还是农村好", "城市好", "农村好", "都好");
        //点击提交
        HelperVotePage.submit(util);
        HelperVotePage.clickVote(util);
        HelperVotePage.submitvote(util);
        HelperVotePage.getresult(util);
       HelperVotePage.getTitle(util);
    }   }