package com.tangl.oss.controller;

import com.tangl.oss.entity.Result;
import com.tangl.oss.service.FileService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 文件控制器
 */
@RestController
@RequestMapping("/files")
public class FileController {

    @Resource
    private FileService fileService;

    @GetMapping("/getAllBuckets")
    public List<String> getAllBuckets() {
        return fileService.getAllBucket();
    }

    @GetMapping("/getUrl")
    public String getUrl(String bucket, String objectName) throws Exception {
        return fileService.getUrl(bucket, objectName);
    }

    /**
     * 上传文件
     */
    @PostMapping("/upload")
    public Result<?> upload(MultipartFile file, String bucket, String objectName) throws Exception {
        String url = fileService.uploadFile(file, bucket, objectName);
        return Result.ok(url);
    }

}
