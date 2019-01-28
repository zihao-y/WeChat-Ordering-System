package module.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Zihao
 */

@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    /** Order id. */
    private String orderId;

    /** Product id. */
    private String productId;

    /** Product name. */
    private String productName;

    /** Product price. */
    private BigDecimal productPrice;

    /** Product quantity. */
    private Integer productQuantity;

    /** Product image. */
    private String productIcon;
}
