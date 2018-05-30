package pagehelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import page.PageNewBlock;
import page.PageVote;
import util.SeleniumUtil;

import java.util.List;

/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperVotePage {
    public static Logger logger=Logger.getLogger( HelperVotePage.class);
    //找到发表投票页面
    public  static  void  ckickvote(SeleniumUtil util){
        util.click(PageVote.VOTE_LINK_PUB);
        util.click(PageVote.VOTE_TEXT_VOTE);
    }
    //输入
    public  static  void  inputVote(SeleniumUtil util,String text1,String text2,String text3,String text4) throws InterruptedException {
       util.waitForElementLoad(PageVote.VOTE_TEXT_VOTE,10);
        util.sendKeys(PageVote.VOTE_TEXT_VOTE,text1);
        util.waitForElementLoad(PageVote.VOTE_TEXT_ONE,10);
        util.sendKeys(PageVote.VOTE_TEXT_ONE,text2);
        util.waitForElementLoad(PageVote.VOTE_TEXT_TWO,10);
        util.sendKeys(PageVote.VOTE_TEXT_TWO,text3);
        util.waitForElementLoad(PageVote.VOTE_TEXT_THREE,10);
        util.sendKeys(PageVote.VOTE_TEXT_THREE,text4);
    }
    //发表按钮
   public  static  void  submit(SeleniumUtil util){
       util.waitForElementLoad(PageVote.VOTE_BUTTON_SUBMIT,10);
     util.click(PageVote.VOTE_BUTTON_SUBMIT);
   }
  //选择一个投一票
    public  static  void  clickVote(SeleniumUtil util) {
        util.waitForElementLoad(PageVote.VOTE_BUTTON_FORM,10);
        util.click(PageVote.VOTE_BUTTON_FORM);
    }
 //提交选择结果
      public  static  void submitvote(SeleniumUtil util){
          util.click(PageVote.VOTE_BUTTON_SUBMITVOTE);
      }
//取出投票各个选项的名称以及投票比例
    public static void  getresult(SeleniumUtil util){
        util.waitForElementLoad(PageVote.VOTE_LINK_CONTENT,10);
        util.getText(PageVote.VOTE_LINK_CONTENT);
    }

    //投票主题
   public static  void  getTitle(SeleniumUtil util){
       util.waitForElementLoad(PageVote.VOTE_LINK_TITLE,10);
       util.getText(PageVote.VOTE_LINK_TITLE);
   }
    }

