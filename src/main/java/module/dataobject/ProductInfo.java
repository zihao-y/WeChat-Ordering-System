package module.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import module.enums.ProductStatusEnum;
import module.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Product
 * Created by Zihao
 */

@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /** Name. */
    private String productName;

    /** Price. */
    private BigDecimal productPrice;

    /** Number in stock. */
    private Integer productStock;

    /** Description. */
    private String productDescription;

    /** Image. */
    private String productIcon;

    /** Status, 0 -> on-sale, 1 -> off-sale. */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /** Category type. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
