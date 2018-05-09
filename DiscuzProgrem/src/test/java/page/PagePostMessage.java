package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PagePostMessage {

    //发布帖子
    public  static  final  By POST_LINK_MESSAGE=By.xpath("//*[@id=\"newspecial\"]");
    //标题
    public  static  final  By POST_TEXT_TITLE=By.id("subject");
    //内容

    public  static final By POST_TEXT_CONTENT=By.xpath("/html/body");
    //发表帖子按钮
    public  static  final  By POST_BUTTON_POST=By.name("topicsubmit");
    //保存为草稿
    public  static  final By POST_BUTTON_PRESERVATION=By.xpath("//*[@id=\"postsubmit\"]");

    //快速发帖
   //输入标题
    public  static  final By POST_TEXT_SEND=By.xpath("//*[@id=\"subject\"]");
    //输入内容
    public  static  final By POST_TEXT_SENDCONTENT=By.xpath("//*[@id=\"fastpostmessage\"]");

}
