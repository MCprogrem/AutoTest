package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageVote {
    //发表投票
   // public  static  final By VOTE_LINK_PUBLISH=By.xpath("//*[@id=\"editorbox\"]/ul/li[2]/a");
    public  static  final  By VOTE_LINK_PUB=By.xpath("//*[@id=\"editorbox\"]/ul/li[2]/a");
    //投票选项
    public  static  final  By VOTE_TEXT_VOTE=By.id("subject");
    public  static  final  By VOTE_TEXT_ONE=By.xpath("//*[@id=\"pollm_c_1\"]/p[1]/input");
    public  static  final  By VOTE_TEXT_TWO=By.xpath("//*[@id=\"pollm_c_1\"]/p[2]/input");
    public  static  final  By VOTE_TEXT_THREE=By.xpath("//*[@id=\"pollm_c_1\"]/p[3]/input");
    public  static  final  By VOTE_TEXT_FOUR=By.xpath("/html/body");
    public  static  final  By VOTE_BUTTON_SUBMIT=By.xpath("//*[@id=\"postsubmit\"]");
    //选择投票
    public  static  final By VOTE_BUTTON_FORM=By.id("option_1");
    //取出投票各个选项的名称以及投票比例
    public  static  final  By VOTE_LINK_CONTENT=By.xpath("//*[@id=\"poll\"]/div[2]/table");
    //提交投票按钮
    public  static  final  By VOTE_BUTTON_SUBMITVOTE=By.name("pollsubmit");


    //投票主题
    public  static  final  By VOTE_LINK_TITLE=By.xpath("//*[@id=\"postlist\"]/table[1]/tbody/tr/td[2]");
  //  public  static  final  By VOTE_LINK_TITLE1=By.xpath("//*[@id=\"thread_subject\"]");
}
