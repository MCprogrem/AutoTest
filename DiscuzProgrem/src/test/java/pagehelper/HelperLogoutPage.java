package pagehelper;

import page.PageLogout;
import util.SeleniumUtil;
import org.apache.log4j.Logger;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperLogoutPage {
    public static Logger logger=Logger.getLogger( SeleniumUtil.class);

    //用户登出
    public  static  void  clickLogout(SeleniumUtil util){
        util.waitForElementLoad(PageLogout.LOGOUT_LINK_QUIT,10);
        util.click(PageLogout.LOGOUT_LINK_QUIT);
    }


}
