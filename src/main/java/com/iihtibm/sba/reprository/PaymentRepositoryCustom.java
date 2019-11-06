package com.iihtibm.sba.reprository;

import com.iihtibm.sba.model.PaymentDtls;

/**
 * @author savagelee
 */
public interface PaymentRepositoryCustom {

    PaymentDtls aggregateByMentorId(Long mentorId, Long trainingId);
    
}
