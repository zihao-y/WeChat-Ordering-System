package module.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Zihao
 */

@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /**
     * Authorization url of WeChat Public Platform
     */
    public String wechatMpAuthorize;

    /**
     * Authorization url of WeChat Open Platform
     */
    public String wechatOpenAuthorize;

    /**
     * Ordering System
     */
    public String sell;
}
