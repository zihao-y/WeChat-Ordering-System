package module.service;

import module.dto.OrderDTO;

/**
 * Send message
 * Created by Zihao
 */

public interface PushMessageService {

    /**
     * message about the update of order status
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
