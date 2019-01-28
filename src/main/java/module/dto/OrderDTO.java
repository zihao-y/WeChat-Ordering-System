package module.dto;

import module.dataobject.OrderDetail;
import module.enums.OrderStatusEnum;
import module.enums.PayStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import module.utils.EnumUtil;
import module.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Zihao
 */

@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /** Order id. */
    private String orderId;

    /** Buyer's name. */
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
    private Integer orderStatus;

    /** Payment status, 0(haven't paid yet) by default. */
    private Integer payStatus;

    /** Create time. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** Update time. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
