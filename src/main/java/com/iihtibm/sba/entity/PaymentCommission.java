package com.iihtibm.sba.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author savagelee
 */
@Document(collection = "payment_commission")
public class PaymentCommission extends AuditModel {

	private static final long serialVersionUID = 1L;

	@Transient
	public static final String SEQUENCE_NAME = "payment_comm_sequence";
	
	@Id
	@Field(value = "_id")
	private Long id;

	@Field(value = "commission_percent")
	private Float commissionPercent;

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(Float commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

}
