package module.dto;

import lombok.Data;

/**
 * Cart
 * Created by Zihao
 */

@Data
public class CartDTO {

    /** Product id. */
    private String productId;

    /** Number. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
