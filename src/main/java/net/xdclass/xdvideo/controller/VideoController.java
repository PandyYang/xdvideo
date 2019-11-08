package net.xdclass.xdvideo.controller;

import net.xdclass.xdvideo.domain.Video;
import net.xdclass.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Pandy
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("page")
    public Object pageVideo(){
        return videoService.findAll();
    }

    @GetMapping("find_by_id")
    public Object findById(int videoId){
        return videoService.findById(videoId);
    }

    @DeleteMapping("del_by_id")
    public Object delById(int id){
        return videoService.delete(id);
    }

    @PutMapping("update_by_id")
    public Object update(int id,String title){

        Video video = new Video();
        video.setId(id);
        video.setTitle(title);
        return videoService.update(video);
    }

    @PostMapping("save")
    public Object save(String title){
        Video video = new Video();
        video.setTitle(title);
        return videoService.save(video);
    }

}
