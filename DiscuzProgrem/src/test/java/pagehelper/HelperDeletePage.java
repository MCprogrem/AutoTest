package pagehelper;

import org.apache.log4j.Logger;
import page.PageDefaultBlock;
import page.PageDelete;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperDeletePage {

    public static Logger logger=Logger.getLogger( HelperDeletePage.class);

    //找管理面板
    public static  void  clickManage(SeleniumUtil util){
        util.click(PageDelete.DELETE_LINK_MANAGE);
    }
    //找帖子
    public  static  void clickContent(SeleniumUtil util){

        util.waitForElementLoad(PageDelete.DELETE_BUTTON_CONTENT,10);
        util.click(PageDelete.DELETE_BUTTON_CONTENT);
    }
    //找删除按钮
    public  static  void  clickDelete(SeleniumUtil util){

        util.click(PageDelete.DELETE_BUTTON_DELETE);
    }
    //删除原因选择
    public  static  void clickSelect(SeleniumUtil util){
        util.click(PageDelete.DELETE_BUTTON_REASON);
    }
    //输入原因
    public  static  void  inputReason(SeleniumUtil util,String reason){
        util.sendKeys(PageDelete.DELETE_TEXT_REASON,reason);
    }
    //确定按钮
    public  static  void clickCeratin(SeleniumUtil util){

        util.waitForElementLoad(PageDelete.DELETE_BUTTON_CERTAIN,10);
        util.click(PageDelete.DELETE_BUTTON_CERTAIN);
    }
}
