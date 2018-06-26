package com.anx.reconciliation.entity;

import org.springframework.data.annotation.Id;

public class Transaction {
	
	public Transaction(String transactionId, String versionAccountIdAmount, String ccy, String fee, String ipAddress,
			String processedDateTimeReceivedDateTimeTransactionState, String transactionType, String mClass,
			String userPaymentMethodId, String coinAddressCoinConfirmations, String coinTransactionId, String fillId,
			String orderId, String confirmationId, String balanceAfter, String balanceBefore,
			String reversalOriginalBalance, String paymentTransferType, String subAccountId, String siteEnum,
			String couponId, String uuid, String tradeId, String orderOutstandingFixedAmount,
			String orderSettlementCCyExecutedAmount, String orderTradedCcyExecutedAmount,
			String externalSystemUserAccountId, String externalSystemUserAccountName, String operatorComment,
			String operatorUserName, String operatorId, String originatingTransactionId, String subAccountBalanceBefore,
			String subAccountBalanceAfter, String reversalOriginalSubAccountBalanceTradeUuidd,
			String ccReceivedRequestUuid, String batchSendId, String fundTransferBatchId) {
		this.transactionId = transactionId;
		this.versionAccountIdAmount = versionAccountIdAmount;
		this.ccy = ccy;
		this.fee = fee;
		this.ipAddress = ipAddress;
		this.processedDateTimeReceivedDateTimeTransactionState = processedDateTimeReceivedDateTimeTransactionState;
		this.transactionType = transactionType;
		this.mClass = mClass;
		this.userPaymentMethodId = userPaymentMethodId;
		this.coinAddressCoinConfirmations = coinAddressCoinConfirmations;
		this.coinTransactionId = coinTransactionId;
		this.fillId = fillId;
		this.orderId = orderId;
		this.confirmationId = confirmationId;
		this.balanceAfter = balanceAfter;
		this.balanceBefore = balanceBefore;
		this.reversalOriginalBalance = reversalOriginalBalance;
		this.paymentTransferType = paymentTransferType;
		this.subAccountId = subAccountId;
		this.siteEnum = siteEnum;
		this.couponId = couponId;
		this.uuid = uuid;
		this.tradeId = tradeId;
		this.orderOutstandingFixedAmount = orderOutstandingFixedAmount;
		this.orderSettlementCCyExecutedAmount = orderSettlementCCyExecutedAmount;
		this.orderTradedCcyExecutedAmount = orderTradedCcyExecutedAmount;
		this.externalSystemUserAccountId = externalSystemUserAccountId;
		this.externalSystemUserAccountName = externalSystemUserAccountName;
		this.operatorComment = operatorComment;
		this.operatorUserName = operatorUserName;
		this.operatorId = operatorId;
		this.originatingTransactionId = originatingTransactionId;
		this.subAccountBalanceBefore = subAccountBalanceBefore;
		this.subAccountBalanceAfter = subAccountBalanceAfter;
		this.reversalOriginalSubAccountBalanceTradeUuidd = reversalOriginalSubAccountBalanceTradeUuidd;
		this.ccReceivedRequestUuid = ccReceivedRequestUuid;
		this.batchSendId = batchSendId;
		this.fundTransferBatchId = fundTransferBatchId;
	}
	
	@Id
	private String Id;
	private String transactionId;
	private String versionAccountIdAmount;
	private String ccy;
	private String fee;
	private String ipAddress;
	private String processedDateTimeReceivedDateTimeTransactionState;
	private String transactionType;
	private String mClass;
	private String userPaymentMethodId;
	private String coinAddressCoinConfirmations;
	private String coinTransactionId;
	private String fillId;
	private String orderId;
	private String confirmationId;
	private String balanceAfter;
	private String balanceBefore;
	private String reversalOriginalBalance;
	private String paymentTransferType;
	private String subAccountId;
	private String siteEnum;
	private String couponId;
	private String uuid;
	private String tradeId;
	private String orderOutstandingFixedAmount;
	private String orderSettlementCCyExecutedAmount;
	private String orderTradedCcyExecutedAmount;
	private String externalSystemUserAccountId;
	private String externalSystemUserAccountName;
	private String operatorComment;
	private String operatorUserName;
	private String operatorId;
	private String originatingTransactionId;
	private String subAccountBalanceBefore;
	private String subAccountBalanceAfter;
	private String reversalOriginalSubAccountBalanceTradeUuidd;
	private String ccReceivedRequestUuid;
	private String batchSendId;
	private String fundTransferBatchId;
	
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getVersionAccountIdAmount() {
		return versionAccountIdAmount;
	}
	public void setVersionAccountIdAmount(String versionAccountIdAmount) {
		this.versionAccountIdAmount = versionAccountIdAmount;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getProcessedDateTimeReceivedDateTimeTransactionState() {
		return processedDateTimeReceivedDateTimeTransactionState;
	}
	public void setProcessedDateTimeReceivedDateTimeTransactionState(
			String processedDateTimeReceivedDateTimeTransactionState) {
		this.processedDateTimeReceivedDateTimeTransactionState = processedDateTimeReceivedDateTimeTransactionState;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getmClass() {
		return mClass;
	}
	public void setmClass(String mClass) {
		this.mClass = mClass;
	}
	public String getUserPaymentMethodId() {
		return userPaymentMethodId;
	}
	public void setUserPaymentMethodId(String userPaymentMethodId) {
		this.userPaymentMethodId = userPaymentMethodId;
	}
	public String getCoinAddressCoinConfirmations() {
		return coinAddressCoinConfirmations;
	}
	public void setCoinAddressCoinConfirmations(String coinAddressCoinConfirmations) {
		this.coinAddressCoinConfirmations = coinAddressCoinConfirmations;
	}
	public String getCoinTransactionId() {
		return coinTransactionId;
	}
	public void setCoinTransactionId(String coinTransactionId) {
		this.coinTransactionId = coinTransactionId;
	}
	public String getFillId() {
		return fillId;
	}
	public void setFillId(String fillId) {
		this.fillId = fillId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getConfirmationId() {
		return confirmationId;
	}
	public void setConfirmationId(String confirmationId) {
		this.confirmationId = confirmationId;
	}
	public String getBalanceAfter() {
		return balanceAfter;
	}
	public void setBalanceAfter(String balanceAfter) {
		this.balanceAfter = balanceAfter;
	}
	public String getBalanceBefore() {
		return balanceBefore;
	}
	public void setBalanceBefore(String balanceBefore) {
		this.balanceBefore = balanceBefore;
	}
	public String getReversalOriginalBalance() {
		return reversalOriginalBalance;
	}
	public void setReversalOriginalBalance(String reversalOriginalBalance) {
		this.reversalOriginalBalance = reversalOriginalBalance;
	}
	public String getPaymentTransferType() {
		return paymentTransferType;
	}
	public void setPaymentTransferType(String paymentTransferType) {
		this.paymentTransferType = paymentTransferType;
	}
	public String getSubAccountId() {
		return subAccountId;
	}
	public void setSubAccountId(String subAccountId) {
		this.subAccountId = subAccountId;
	}
	public String getSiteEnum() {
		return siteEnum;
	}
	public void setSiteEnum(String siteEnum) {
		this.siteEnum = siteEnum;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getOrderOutstandingFixedAmount() {
		return orderOutstandingFixedAmount;
	}
	public void setOrderOutstandingFixedAmount(String orderOutstandingFixedAmount) {
		this.orderOutstandingFixedAmount = orderOutstandingFixedAmount;
	}
	public String getOrderSettlementCCyExecutedAmount() {
		return orderSettlementCCyExecutedAmount;
	}
	public void setOrderSettlementCCyExecutedAmount(String orderSettlementCCyExecutedAmount) {
		this.orderSettlementCCyExecutedAmount = orderSettlementCCyExecutedAmount;
	}
	public String getOrderTradedCcyExecutedAmount() {
		return orderTradedCcyExecutedAmount;
	}
	public void setOrderTradedCcyExecutedAmount(String orderTradedCcyExecutedAmount) {
		this.orderTradedCcyExecutedAmount = orderTradedCcyExecutedAmount;
	}
	public String getExternalSystemUserAccountId() {
		return externalSystemUserAccountId;
	}
	public void setExternalSystemUserAccountId(String externalSystemUserAccountId) {
		this.externalSystemUserAccountId = externalSystemUserAccountId;
	}
	public String getExternalSystemUserAccountName() {
		return externalSystemUserAccountName;
	}
	public void setExternalSystemUserAccountName(String externalSystemUserAccountName) {
		this.externalSystemUserAccountName = externalSystemUserAccountName;
	}
	public String getOperatorComment() {
		return operatorComment;
	}
	public void setOperatorComment(String operatorComment) {
		this.operatorComment = operatorComment;
	}
	public String getOperatorUserName() {
		return operatorUserName;
	}
	public void setOperatorUserName(String operatorUserName) {
		this.operatorUserName = operatorUserName;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOriginatingTransactionId() {
		return originatingTransactionId;
	}
	public void setOriginatingTransactionId(String originatingTransactionId) {
		this.originatingTransactionId = originatingTransactionId;
	}
	public String getSubAccountBalanceBefore() {
		return subAccountBalanceBefore;
	}
	public void setSubAccountBalanceBefore(String subAccountBalanceBefore) {
		this.subAccountBalanceBefore = subAccountBalanceBefore;
	}
	public String getSubAccountBalanceAfter() {
		return subAccountBalanceAfter;
	}
	public void setSubAccountBalanceAfter(String subAccountBalanceAfter) {
		this.subAccountBalanceAfter = subAccountBalanceAfter;
	}
	public String getReversalOriginalSubAccountBalanceTradeUuidd() {
		return reversalOriginalSubAccountBalanceTradeUuidd;
	}
	public void setReversalOriginalSubAccountBalanceTradeUuidd(String reversalOriginalSubAccountBalanceTradeUuidd) {
		this.reversalOriginalSubAccountBalanceTradeUuidd = reversalOriginalSubAccountBalanceTradeUuidd;
	}
	public String getCcReceivedRequestUuid() {
		return ccReceivedRequestUuid;
	}
	public void setCcReceivedRequestUuid(String ccReceivedRequestUuid) {
		this.ccReceivedRequestUuid = ccReceivedRequestUuid;
	}
	public String getBatchSendId() {
		return batchSendId;
	}
	public void setBatchSendId(String batchSendId) {
		this.batchSendId = batchSendId;
	}
	public String getFundTransferBatchId() {
		return fundTransferBatchId;
	}
	public void setFundTransferBatchId(String fundTransferBatchId) {
		this.fundTransferBatchId = fundTransferBatchId;
	}
	

}
