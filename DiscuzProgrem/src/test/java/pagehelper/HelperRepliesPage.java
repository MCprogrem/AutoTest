package pagehelper;

import org.apache.log4j.Logger;
import page.PageReplies;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperRepliesPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    //找帖子
    public  static void clickCard(SeleniumUtil util){
        util.click(PageReplies.REPLIES_link_CARD);
    }

}
