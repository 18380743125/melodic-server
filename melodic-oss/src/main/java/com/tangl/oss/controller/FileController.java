package com.tangl.oss.controller;

import com.tangl.oss.entity.Result;
import com.tangl.oss.service.FileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件控制器
 */
@RestController
public class FileController {

    @Resource()
    private FileService fileService;

    @GetMapping("/getAllBuckets")
    public List<String> getAllBuckets() {
        return fileService.getAllBucket();
    }

    @GetMapping("/getUrl")
    public String getUrl(String bucketName, String objectName) throws Exception {
        return fileService.getUrl(bucketName, objectName);
    }

    /**
     * 上传文件
     */
    @PostMapping("/upload")
    public Result<?> upload(MultipartFile uploadFile, String bucket, String objectName) throws Exception {
        String url = fileService.uploadFile(uploadFile, bucket, objectName);
        return Result.ok(url);
    }

}
