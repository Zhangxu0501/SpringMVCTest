package com.zx.upload;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zhangxu on 2017/6/20.
 */
public class FileModel {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
