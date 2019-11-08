package net.xdclass.xdvideo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("net.xdclass.xdvideo.mapper")
public class XdvideoApplication {
    public static void main(String[] args) {
        SpringApplication.run(XdvideoApplication.class, args);
    }

}
