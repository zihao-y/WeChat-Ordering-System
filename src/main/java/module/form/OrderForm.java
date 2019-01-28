package module.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Zihao
 */

@Data
public class OrderForm {

    /**
     * Buyer's name
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /**
     * Buyer's phone number
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /**
     * Buyer's address
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /**
     * Buyer's WeChat openid
     */
    @NotEmpty(message = "openid必填")
    private String openid;

    /**
     * Cart
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
