package com.iihtibm.sba.reprository;

import java.util.Date;

import com.iihtibm.sba.entity.Payment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * @author savagelee
 */
public interface PaymentRepository extends MongoRepository<Payment, Long>, PaymentRepositoryCustom {
	
	@Query(value = "{ 'mentorId':?0, 'createdDate':{$gte:?0, $lte:?1 } }")
	Page<Payment> findPaymentDtlsByMentorid(Long mentorId, Date startDate, Date endDate, Pageable pageable);

	@Query(value = "{ 'createdDate':{$gte:?0, $lte:?1 } }")
	Page<Payment> findPaymentDtlsByDateRange(Date startDate, Date endDate, Pageable pageable);
	
}
