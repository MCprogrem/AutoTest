package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageVote {
    //发表投票
    public  static  final By VOTE_LINK_PUBLISH=By.xpath("//*[@id=\"editorbox\"]/ul/li[2]/a");
    //投票选项
    public  static  final  By VOTE_LINK_VOTE=By.xpath("//*[@id=\"normalthread_4\"]/tr/th");
    //取出投票各个选项的名称以及投票比例
    public  static  final  By VOTE_LINK_CONTENT=By.xpath("//*[@id=\"poll\"]");
    //投票主题
    public  static  final  By VOTE_LINK_TITLE=By.xpath("//*[@id=\"postlist\"]/table[1]/tbody/tr/td[2]");
}
