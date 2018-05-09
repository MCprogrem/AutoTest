package testcase;

import util.LogConfiguration;
import util.ReadBrowserProperties;
import util.SeleniumUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

/**
 * Created by lenovo on 2018/5/8.
 */
public class BasicTestCase {

    public WebDriver driver;
    public SeleniumUtil util;
    private static Logger logger = Logger.getLogger(BasicTestCase.class);
    ReadBrowserProperties re =null;
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        LogConfiguration.initLog();
        util = new SeleniumUtil();
        re=new ReadBrowserProperties();
        String driverType=re.readBrowser();
       // System.setProperty("webdriver.chrome.driver", "E:\\chrome&driver\\chrome&driver\\chromedriver.exe");
        driver=util.getDriver(driverType);
        driver.manage().window().maximize();
        util.url("http://127.0.0.1:8088/Discuz_X3.2_SC_GBK/upload/forum.php");
    }


}