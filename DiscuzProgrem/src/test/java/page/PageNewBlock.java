package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageNewBlock {
    //找到管理中心
    public  static  final By BLOCK_LINK_MANAGEMENT=By.linkText("管理中心");
    //输入密码、
    public  static  final  By BLOCK_TEXT_PASSWORD=By.name("admin_password");
    //提交
    public  static final  By  BLOCK_BUTTON_SUBMIT1=By.name("submit");
    //论坛
    public static  final  By  BLOCK_LINK_FORUM=By.linkText("论坛");
    //添加新版块
    public  static  final By  BLOCK_LINK_ADD=By.className("addtr");
    //添加新版块名称
    public  static  final  By  BLOCK_TEXT_NEEFORUM=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr[1]/td[3]/div/input");
    //设置继承关系
    public  static  final By BLOCK_BUTTON_SELECT=By.name("newinherited[1][]");
    //提交
    public  static  final  By BLOCK_BUTTON_SUBMIT2=By.id("submit_editsubmit");
    //管理员退出
    public static  final By Block_LINK_QUIT=By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");
    //打开新的版块
    public  static  final By BLOCK_NEW_PAGE=By.xpath("//td/h2/a");


}
