package vn.iotstar.service;

import java.nio.file.Path;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IStorageService {
    void init();
    void delete(String storeFilename) throws Exception;
    Path load(String filename);
    Resource loadAsResource(String filename);
    void store(MultipartFile file, String storeFilename);
    String getSorageFilename(MultipartFile file, String id);
}
