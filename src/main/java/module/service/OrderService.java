package module.service;

import module.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Zihao
 */

public interface OrderService {

    /** Create an order. */
    OrderDTO create(OrderDTO orderDTO);

    /** Find an order. */
    OrderDTO findOne(String orderId);

    /** Find the order list for a buyer. */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /** Cancel an order. */
    OrderDTO cancel(OrderDTO orderDTO);

    /** Finish an order. */
    OrderDTO finish(OrderDTO orderDTO);

    /** Pay an order. */
    OrderDTO paid(OrderDTO orderDTO);

    /** Find the order page. */
    Page<OrderDTO> findList(Pageable pageable);

}
