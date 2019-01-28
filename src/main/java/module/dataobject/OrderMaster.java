package module.dataobject;

import module.enums.OrderStatusEnum;
import module.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Zihao
 */

@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** Order id. */
    @Id
    private String orderId;

    /** Buyer name. */
    private String buyerName;

    /** Buyer's phone number. */
    private String buyerPhone;

    /** Buyer's address. */
    private String buyerAddress;

    /** Buyer's WeChat openid. */
    private String buyerOpenid;

    /** Order amount. */
    private BigDecimal orderAmount;

    /** Order status, 0(newly created) by default. */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** Payment status, 0(haven't paid yet) by default. */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** Create time. */
    private Date createTime;

    /** Update time. */
    private Date updateTime;

}
