package module.service;

import module.dataobject.SellerInfo;

/**
 * Seller side
 * Created by Zihao
 */

public interface SellerService {

    /**
     * Find seller info via openid
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
