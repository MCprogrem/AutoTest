package pagehelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import page.PageNewBlock;
import util.SeleniumUtil;

import java.util.List;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperNewBlockPage {
    public static Logger logger=Logger.getLogger( HelperNewBlockPage.class);

    //切换到管理中心
    public  static  void  clickManagement(SeleniumUtil util){

        util.click(PageNewBlock.BLOCK_LINK_MANAGEMENT);
    }
    //输入密码
    public  static void  inputPassword(SeleniumUtil util ,String password) throws InterruptedException {
        util.handle();
       util.waitForElementLoad(PageNewBlock.BLOCK_TEXT_PASSWORD,10);
        util.sendKeys(PageNewBlock.BLOCK_TEXT_PASSWORD,password);
    }
    //提交
    public static  void  clickSubmit(SeleniumUtil util) {
        util.click(PageNewBlock.BLOCK_BUTTON_SUBMIT1);
    }
    //论坛
    public  static  void  clickForum(SeleniumUtil util){
        util.waitForElementLoad(PageNewBlock.BLOCK_LINK_FORUM,10);
        util.click(PageNewBlock.BLOCK_LINK_FORUM);

    }
    //添加新版块
    public static  void  clickAdd(SeleniumUtil util){
        util.iframe("main");
        util.waitForElementLoad(PageNewBlock.BLOCK_LINK_ADD,15);
        util.click(PageNewBlock.BLOCK_LINK_ADD);
    }
    //添加新版块的名称
    public  static  void  alterName(SeleniumUtil util,String name){
        util.waitForElementLoad(PageNewBlock.BLOCK_TEXT_NEEFORUM,10);
        util.clear(PageNewBlock.BLOCK_TEXT_NEEFORUM);
        util.sendKeys(PageNewBlock.BLOCK_TEXT_NEEFORUM,name);
    }
    //设置继承关系
    public  static  void  setInherit(SeleniumUtil util){
        util.waitForElementLoad(PageNewBlock.BLOCK_BUTTON_SELECT,10);
        util.click(PageNewBlock.BLOCK_BUTTON_SELECT);
    }
    //提交
    public static  void  clickSubmitbtn(SeleniumUtil util){
        util.waitForElementLoad(PageNewBlock.BLOCK_BUTTON_SUBMIT2,10);
        util.click(PageNewBlock.BLOCK_BUTTON_SUBMIT2);
    }
    //管理员退出
    public  static  void clickQuit(SeleniumUtil util){
        util.iframe();
        util.click(PageNewBlock.Block_LINK_QUIT);
    }

    //打开新的版块
   public static  void  openNewBlock(SeleniumUtil util,int i){
       util.waitForElementLoad(PageNewBlock.BLOCK_NEW_PAGE,15);
       List<WebElement> list = util.findElements(PageNewBlock.BLOCK_NEW_PAGE);
       list.get(i).click();

   }
//    }

}
