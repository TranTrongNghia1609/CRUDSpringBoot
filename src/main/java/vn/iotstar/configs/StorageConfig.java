package vn.iotstar.configs;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class StorageConfig {

}
