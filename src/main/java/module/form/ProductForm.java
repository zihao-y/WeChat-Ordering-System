package module.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Zihao
 */

@Data
public class ProductForm {


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

    /** Category type. */
    private Integer categoryType;
}
