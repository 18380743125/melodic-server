package com.tangl.oss.adapter;

import com.tangl.oss.entity.FileInfo;
import com.tangl.oss.utils.MinioUtil;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

public class MinioStorageAdapter implements StorageAdapter {

    @Resource
    private MinioUtil minioUtil;

    /**
     * minioUrl
     */
    @Value("${minio.url}")
    private String url;

    @Override
    @SneakyThrows
    public void createBucket(String bucketName) {
        minioUtil.createBucket(bucketName);
    }

    @Override
    @SneakyThrows
    public void uploadFile(MultipartFile uploadFile, String bucket, String objectName) {
        minioUtil.createBucket(bucket);
        if (objectName != null && !objectName.isEmpty()) {
            minioUtil.uploadFile(uploadFile.getInputStream(),
                    bucket,
                    objectName + "/" + uploadFile.getOriginalFilename());
        } else {
            minioUtil.uploadFile(uploadFile.getInputStream(),
                    bucket,
                    uploadFile.getOriginalFilename());
        }
    }

    @Override
    @SneakyThrows
    public List<String> getAllBucket() {
        return minioUtil.getAllBucket();
    }

    @Override
    @SneakyThrows
    public List<FileInfo> getAllFile(String bucket) {
        return minioUtil.getAllFile(bucket);
    }

    @Override
    @SneakyThrows
    public InputStream download(String bucket, String objectName) {
        return minioUtil.download(bucket, objectName);
    }

    @Override
    @SneakyThrows
    public void deleteBucket(String bucket) {
        minioUtil.deleteBucket(bucket);
    }

    @Override
    @SneakyThrows
    public void deleteObject(String bucket, String objectName) {
        minioUtil.deleteObject(bucket, objectName);
    }

    @Override
    @SneakyThrows
    public String getUrl(String bucket, String objectName) {
        String result = url + "/" + bucket;
        if (objectName != null && !objectName.isEmpty()) {
            result = result + "/" + objectName;
        }
        return result;
    }

}
