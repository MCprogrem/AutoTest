package pagehelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import page.PagePostMessage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperPostMessagePage {
    public static Logger logger=Logger.getLogger(HelperPostMessagePage.class);
//发表帖子
    public  static  void clickMessage(SeleniumUtil util){
        util.click(PagePostMessage.POST_LINK_MESSAGE);
    }
    //输入标题
    public static  void inputTitle(SeleniumUtil util ,String text){
        util.sendKeys(PagePostMessage.POST_TEXT_TITLE,text);
    }
    //输入内容
    public  static  void inputContent(SeleniumUtil util,String texts){
        util.iframe("e_iframe");
        util.sendKeys(PagePostMessage.POST_TEXT_CONTENT,texts);

    }
    //发布按钮
    public static void clickPost(SeleniumUtil util){
        util.iframe();
       util.click(PagePostMessage.POST_BUTTON_POST);
    }
    //-------------------------------------------快速发布
    public  static  void  inputSend(SeleniumUtil util,String content){
        util.sendKeys(PagePostMessage.POST_TEXT_SEND,content);
    }
    public  static  void  inputSendContent(SeleniumUtil util,String contents){
        util.sendKeys(PagePostMessage.POST_TEXT_SENDCONTENT,contents);
    }
}
