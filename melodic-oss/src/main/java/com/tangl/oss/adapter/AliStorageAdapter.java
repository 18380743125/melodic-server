package com.tangl.oss.adapter;

import com.tangl.oss.entity.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

public class AliStorageAdapter implements StorageAdapter {
    @Override
    public void createBucket(String bucketName) {

    }

    @Override
    public void uploadFile(MultipartFile uploadFile, String bucket, String objectName) {

    }

    @Override
    public List<String> getAllBucket() {
        List<String> strings = new java.util.ArrayList<>();
        strings.add("bucket1");
        strings.add("bucket2");
        return strings;
    }

    @Override
    public List<FileInfo> getAllFile(String bucket) {
        return new java.util.ArrayList<>();
    }

    @Override
    public InputStream download(String bucket, String objectName) {
        return null;
    }

    @Override
    public void deleteBucket(String bucket) {

    }

    @Override
    public void deleteObject(String bucket, String objectName) {

    }

    @Override
    public String getUrl(String bucket, String objectName) {
        return "";
    }
}
