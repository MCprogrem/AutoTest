package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageReplies {
    //找帖子
    public  static  final By REPLIES_link_CARD=By.xpath("//*[@id=\"normalthread_2\"]/tr/th/a[2]");
    //回复
    public  static  final By REPLIES_LIIK_REPLY=By.linkText("回复");
    //输入回复
    public  static final By REPLIES_TEXT_CONTENT=By.name("message");
    //点击回复
    public  static  final  By REPLIES_BUTTON_PUBLISH=By.xpath("//*[@id=\"postsubmit\"]");
    //快速回复
    public  static  final  By REPLIES_TEXT_CONTENTS=By.xpath("//*[@id=\"fastpostmessage\"]");
    //回复
    public  static final By REPLIES_BUTTON_PUBLISHS=By.xpath("//*[@id=\"fastpostsubmit\"]");
}
