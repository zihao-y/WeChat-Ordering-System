package module.service;

import module.dto.OrderDTO;

/**
 * Buyer
 * Created by Zihao
 */

public interface BuyerService {

    //Find an order
    OrderDTO findOrderOne(String openid, String orderId);

    //Cancel the order
    OrderDTO cancelOrder(String openid, String orderId);
}
