package module.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Zihao
 */

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /**
     * Public platform id
     */
    private String mpAppId;

    /**
     * Public platform secret
     */
    private String mpAppSecret;

    /**
     * Open platform id
     */
    private String openAppId;

    /**
     * Open platform secret
     */
    private String openAppSecret;

    /**
     * Seller id
     */
    private String mchId;

    /**
     * Seller secret
     */
    private String mchKey;

    /**
     * Seller license path
     */
    private String keyPath;

    /**
     * WeChat asynchronous notification url
     */
    private String notifyUrl;

    /**
     * WeChat template id
     */
    private Map<String, String> templateId;
}
