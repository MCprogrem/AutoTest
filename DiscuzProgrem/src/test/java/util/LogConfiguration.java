package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by lenovo on 2018/5/7.
 */
public class LogConfiguration {
    public static void initLog(){
        //指定日期格式
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        //获取当前时间
       String data=dateFormat.format(new Date());
       String logPath="./Log/"+data+".log";
        Properties pro =new Properties();
        //配置日志格式
        pro.setProperty("log4j.rootLogger","info,toConsole,toFile");
        pro.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        pro.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        pro.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        pro.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        pro.setProperty("log4j.appender.toFile.file", logPath);
        PropertyConfigurator.configure(pro);
    }
}
