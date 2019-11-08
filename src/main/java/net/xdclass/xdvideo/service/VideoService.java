package net.xdclass.xdvideo.service;

import net.xdclass.xdvideo.domain.Video;

import java.util.List;

/**
 * @author Pandy\
 * 视频类接口
 */
public interface VideoService {

    List<Video> findAll();
    Video findById(int id);
    int update(Video video);
    int delete(int id);
    int save(Video video);
}
