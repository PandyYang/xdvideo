package net.xdclass.xdvideo.controller;

import net.xdclass.xdvideo.config.WeChatConfig;
import net.xdclass.xdvideo.domain.Video;
import net.xdclass.xdvideo.mapper.VideoMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pandy
 */
@RestController
public class TestController {

    @RequestMapping("test2")
    public String test2() {
        return "Hello World!";
    }

    @Autowired
    private WeChatConfig weChatConfig;
    @RequestMapping("test_config")
    public String testConfig() {
        System.out.println(weChatConfig.getAppId());
        return "TestConfig!";
    }

    @Autowired
    private VideoMapper videoMapper;

    @RequestMapping("findall")
    public Object testDB(){
        return videoMapper.findAll();
    }


}
