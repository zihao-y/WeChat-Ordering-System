package module.service;

import module.dataobject.ProductInfo;
import module.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Product
 * Created by Zihao
 */

public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * Find all the on-sale products
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //Increase the number in stock
    void increaseStock(List<CartDTO> cartDTOList);

    //Decrease the number in stock
    void decreaseStock(List<CartDTO> cartDTOList);

    //On-sale
    ProductInfo onSale(String productId);

    //off-sale
    ProductInfo offSale(String productId);
}
