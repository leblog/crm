package com.xy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author lusifer
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CRMApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CRMApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " ██╗     ██╗   ██╗███████╗██╗███████╗███████╗██████╗ \n"+
                " ██║     ██║   ██║██╔════╝██║██╔════╝██╔════╝██╔══██╗\n"+
                " ██║     ██║   ██║███████╗██║█████╗  █████╗  ██████╔╝\n"+
                " ██║     ██║   ██║╚════██║██║██╔══╝  ██╔══╝  ██╔══██╗\n"+
                " ███████╗╚██████╔╝███████║██║██║     ███████╗██║  ██║\n"+
                " ╚══════╝ ╚═════╝ ╚══════╝╚═╝╚═╝     ╚══════╝╚═╝  ╚═╝");
    }
}
