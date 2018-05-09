package pagehelper;

import org.apache.log4j.Logger;
import page.PageDefaultBlock;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperDefauleBlockPage {
    public static Logger logger=Logger.getLogger(HelperDefauleBlockPage.class);
    public  static void clickDefaultBlock(SeleniumUtil util){
      util.click(PageDefaultBlock.POST_LINK_DEFAULTBLOCK);
    }
}
