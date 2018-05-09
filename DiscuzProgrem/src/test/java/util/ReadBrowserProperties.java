package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lenovo on 2018/5/8.
 */
public class ReadBrowserProperties {
    public  String browserName;
    public  String  readBrowser() throws IOException, InterruptedException {
        Properties properties=new Properties();
        InputStream inputStream =new FileInputStream("./BrowserConfiguration.properties");
        properties.load(inputStream);
        String b=properties.getProperty("browserName");
        inputStream.close();
        Thread.sleep(3000);
        return  b;

}

}
