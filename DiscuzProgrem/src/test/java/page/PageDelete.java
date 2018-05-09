package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageDelete {
    //找管理面板
     public  static  final By DELETE_LINK_MANAGE=By.linkText("管理面板");
    //找帖子
    public static  final  By DELETE_BUTTON_CONTENT=By.name("moderate[]");
    //删除按钮
    public  static  final  By DELETE_BUTTON_DELETE=By.linkText("删除");
    //删除原因选择
    public  static  final  By DELETE_BUTTON_REASON=By.xpath("//*[@id=\"reasonselect\"]");
    //输入原因
    public static final By DELETE_TEXT_REASON=By.xpath("//*[@id=\"reason\"]");
    //确定
    public  static  final By DELETE_BUTTON_CERTAIN=By.xpath("//*[@id=\"modsubmit\"]");
}
