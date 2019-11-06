package com.iihtibm.sba.reprository;

import com.iihtibm.sba.entity.PaymentCommission;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author savagelee
 */
public interface PaymentCommissionRepository extends MongoRepository<PaymentCommission, Long> {

}
