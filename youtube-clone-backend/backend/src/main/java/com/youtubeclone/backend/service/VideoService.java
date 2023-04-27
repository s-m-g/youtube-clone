package com.youtubeclone.backend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoService {

    public void uploadVideo(MultipartFile multipartFile){
        //step1 : upload file to AWS S3 => we will write a separate service for this
        // the above step is needed to get the video url where it is uploaded


        // save video data to DB ->
    }
}
