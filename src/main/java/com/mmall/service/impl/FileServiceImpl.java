package com.mmall.service.impl;

import com.mmall.service.IFileService;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Allen
 */
public class FileServiceImpl implements IFileService {
    public String upload(MultipartFile file,String path){
        String filenName = file.getOriginalFilename();
        //扩展名
        //abc.jpg
        
    }
}
