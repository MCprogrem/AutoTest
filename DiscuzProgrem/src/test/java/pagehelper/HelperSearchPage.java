package pagehelper;

import org.apache.log4j.Logger;
import org.apache.xerces.impl.io.UCSReader;
import org.openqa.selenium.By;
import page.PageSearch;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperSearchPage {
    public static Logger logger=Logger.getLogger(HelperSearchPage .class);
    //搜索框输入搜索内容
    public  static  void  inputContent(SeleniumUtil util,String text){
        util.waitForElementLoad(PageSearch.SEARCH_TEXT_CONTENT,10);
        util.sendKeys(PageSearch.SEARCH_TEXT_CONTENT,text);
    }
   //搜索按钮
    public  static  void clickSearchbtn(SeleniumUtil util){
        util.waitForElementLoad(PageSearch.SEARCH_BUTTON_SEARCH,10);
        util.click(PageSearch.SEARCH_BUTTON_SEARCH);
    }
    //搜索存在的帖子并进入

    public  static  void  clickLink(SeleniumUtil util) throws InterruptedException {
        util.handle();
        util.waitForElementLoad(PageSearch.SEARCH_CONTENT_HAO,15);
        util.click(PageSearch.SEARCH_CONTENT_HAO);
        util.handle();
    }
    //验证帖子标题和期望的一致
    public  static  void clickVerify(SeleniumUtil util, String expected) throws InterruptedException {
        util.waitForElementLoad(PageSearch.SEARCH_TEXT_TITLE,15);
          util.assertForText(expected,PageSearch.SEARCH_TEXT_TITLE);

   }
}
