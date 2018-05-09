package pagehelper;

import org.apache.log4j.Logger;
import org.apache.xerces.impl.io.UCSReader;
import page.PageSearch;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperSearchPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    //搜索框输入搜索内容
    public  static  void  inputContent(SeleniumUtil util,String text){
        util.sendKeys(PageSearch.SEARCH_TEXT_CONTENT,text);
    }
   //搜索按钮
    public  static  void clickSearchbtn(SeleniumUtil util){
        util.click(PageSearch.SEARCH_BUTTON_SEARCH);
    }
}
