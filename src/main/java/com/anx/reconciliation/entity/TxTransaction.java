package com.anx.reconciliation.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import com.google.gson.annotations.SerializedName;

public class TxTransaction {

	@Id
	private String id;
	
	@SerializedName("txid")
	private String txnId;
	
	@SerializedName("time")
	private String time;
	
	@SerializedName("address")
	private String address;
	
	@SerializedName("type")
	private String type;
	
	@SerializedName("amount")
	private String amount;
	
	@SerializedName("fee")
	private String fee;
	
	private boolean hasMatched;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return new BigDecimal(amount);
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public BigDecimal bigDecimalFee() {
		return new BigDecimal(fee);
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}
	

	public boolean isHasMatched() {
		return hasMatched;
	}

	public void setHasMatched(boolean hasMatched) {
		this.hasMatched = hasMatched;
	}

	@Override
	public String toString() {
		return "Transaction [txnId=" + txnId + ", time=" + time + ", address=" + address + ", type=" + type
				+ ", amount=" + amount + ", fee=" + fee + "]";
	}
}
