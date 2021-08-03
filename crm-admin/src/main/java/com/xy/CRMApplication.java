package com.xy;

import com.xy.common.utils.security.CipherUtils;
import org.apache.shiro.codec.Base64;
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
        Base64.encodeToString(CipherUtils.generateNewKey(128, "AES").getEncoded());
        System.out.println("系统启动成功 \n" +
                " ██╗     ██╗   ██╗███████╗██╗███████╗███████╗██████╗ \n"+
                " ██║     ██║   ██║██╔════╝██║██╔════╝██╔════╝██╔══██╗\n"+
                " ██║     ██║   ██║███████╗██║█████╗  █████╗  ██████╔╝\n"+
                " ██║     ██║   ██║╚════██║██║██╔══╝  ██╔══╝  ██╔══██╗\n"+
                " ███████╗╚██████╔╝███████║██║██║     ███████╗██║  ██║\n"+
                " ╚══════╝ ╚═════╝ ╚══════╝╚═╝╚═╝     ╚══════╝╚═╝  ╚═╝");
    }
}
