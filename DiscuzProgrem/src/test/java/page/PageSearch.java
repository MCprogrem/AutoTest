package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageSearch {
    //搜索框
    public  static  final By  SEARCH_TEXT_CONTENT=By.name("srchtxt");
    //搜索按钮
    public  static  final  By SEARCH_BUTTON_SEARCH=By.xpath("//*[@id=\"scbar_btn\"]");
    //进入搜索的帖子
     public  static  final By  SEARCH_CONTENT_HAO=By.xpath("//*[@id=\"132\"]/h3/a/strong/font");
    //验证帖子标题和期望的一致
    public  static  final By SEARCH_TEXT_TITLE=By.id("thread_subject");

}
