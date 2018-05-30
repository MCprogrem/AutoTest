package pagehelper;

import org.apache.log4j.Logger;
import page.PageReplies;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperRepliesPage {
    public static Logger logger=Logger.getLogger( HelperRepliesPage.class);
    //找帖子
    public  static void clickCard(SeleniumUtil util){
        util.click(PageReplies.REPLIES_link_CARD);
    }
    //回复
    public  static  void  clickReply(SeleniumUtil util){
        util.click(PageReplies.REPLIES_LIIK_REPLY);
    }
    //输入回复
    public  static  void  inputContent(SeleniumUtil util,String text){
        util.sendKeys(PageReplies.REPLIES_TEXT_CONTENT,text);
    }
  //点击回复按钮
    public  static  void  clickButton(SeleniumUtil util){
        util.click(PageReplies.REPLIES_BUTTON_PUBLISH);
    }
    //________________________________快速回复
    public  static  void inputContents(SeleniumUtil util,String content){
        util.waitForElementLoad(PageReplies.REPLIES_TEXT_CONTENTS,15);
        util.sendKeys(PageReplies.REPLIES_TEXT_CONTENTS,content);
    }
    public  static  void  clickBtn(SeleniumUtil util){
        util.waitForElementLoad(PageReplies.REPLIES_BUTTON_PUBLISHS,10);
        util.click(PageReplies.REPLIES_BUTTON_PUBLISHS);
    }
}
