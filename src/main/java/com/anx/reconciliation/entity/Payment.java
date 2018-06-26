package com.anx.reconciliation.entity;

import org.springframework.data.annotation.Id;

public class Payment {
	
	public Payment(String paymentId, String version, String amount, String ccy, String paymentState, String paymentType,
			String processedDateTime, String userName, String mClass, String coinAddress, String coinTransactionId,
			String confirmations, String accountNumber, String bankName, String cashTransactionId,
			String accountAddress, String bankAddress, String bankNumber, String branchName, String method,
			String optionalReference, String paymentTransferType, String oneTimeAuth, String paymentEmail,
			String paymentPhone, String approvedBy, String depositMethod, String depositNotifyCode,
			String operatorComment, String uuid, String couponId, String fee, String name, String cardId,
			String tradeId, String originalDepositAmount, String originalDepositCurrency, String cardPaymentCouponId,
			String debitedDepositAmount, String reconciled, String paymentBatchId, String transactionId,
			String amountSubmitToThirdParty, String invoiceId, String paymentCouponId, String institutionNumber,
			String routingNumber, String transitNumber, String userId, String approvedByUserId, String createdByUserId,
			String accountType, String subAccountId, String dccRequestTime, String dccReceivedRequestId,
			String originatingPaymentId, String fundTransferBatchId, String chequeNumber) {

		this.paymentId = paymentId;
		this.version = version;
		this.amount = amount;
		this.ccy = ccy;
		this.paymentState = paymentState;
		this.paymentType = paymentType;
		this.processedDateTime = processedDateTime;
		this.userName = userName;
		this.mClass = mClass;
		this.coinAddress = coinAddress;
		this.coinTransactionId = coinTransactionId;
		this.confirmations = confirmations;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.cashTransactionId = cashTransactionId;
		this.accountAddress = accountAddress;
		this.bankAddress = bankAddress;
		this.bankNumber = bankNumber;
		this.branchName = branchName;
		this.method = method;
		this.optionalReference = optionalReference;
		this.paymentTransferType = paymentTransferType;
		this.oneTimeAuth = oneTimeAuth;
		this.paymentEmail = paymentEmail;
		this.paymentPhone = paymentPhone;
		this.approvedBy = approvedBy;
		this.depositMethod = depositMethod;
		this.depositNotifyCode = depositNotifyCode;
		this.operatorComment = operatorComment;
		this.uuid = uuid;
		this.couponId = couponId;
		this.fee = fee;
		this.name = name;
		this.cardId = cardId;
		this.tradeId = tradeId;
		this.originalDepositAmount = originalDepositAmount;
		this.originalDepositCurrency = originalDepositCurrency;
		this.cardPaymentCouponId = cardPaymentCouponId;
		this.debitedDepositAmount = debitedDepositAmount;
		this.reconciled = reconciled;
		this.paymentBatchId = paymentBatchId;
		this.transactionId = transactionId;
		this.amountSubmitToThirdParty = amountSubmitToThirdParty;
		this.invoiceId = invoiceId;
		this.paymentCouponId = paymentCouponId;
		this.institutionNumber = institutionNumber;
		this.routingNumber = routingNumber;
		this.transitNumber = transitNumber;
		this.userId = userId;
		this.approvedByUserId = approvedByUserId;
		this.createdByUserId = createdByUserId;
		this.accountType = accountType;
		this.subAccountId = subAccountId;
		this.dccRequestTime = dccRequestTime;
		this.dccReceivedRequestId = dccReceivedRequestId;
		this.originatingPaymentId = originatingPaymentId;
		this.fundTransferBatchId = fundTransferBatchId;
		this.chequeNumber = chequeNumber;
	}
	@Id
	private String Id;
	private String paymentId;
	private String version;
	private String amount;
	private String ccy;
	private String paymentState;
	private String paymentType;
	private String processedDateTime;
	private String userName;
	private String mClass;
	private String coinAddress;
	private String coinTransactionId;
	private String confirmations;
	private String accountNumber;
	private String bankName;
	private String cashTransactionId;
	private String accountAddress;
	private String bankAddress;
	private String bankNumber;
	private String branchName;
	private String method;
	private String optionalReference;
	private String paymentTransferType;
	private String oneTimeAuth;
	private String paymentEmail;
	private String paymentPhone;
	private String approvedBy;
	private String depositMethod;
	private String depositNotifyCode;
	private String operatorComment;
	private String uuid;
	private String couponId;
	private String fee;
	private String name;
	private String cardId;
	private String tradeId;
	private String originalDepositAmount;
	private String originalDepositCurrency;
	private String cardPaymentCouponId;
	private String debitedDepositAmount;
	private String reconciled;
	private String paymentBatchId;
	private String transactionId;
	private String amountSubmitToThirdParty;
	private String invoiceId;
	private String paymentCouponId;
	private String institutionNumber;
	private String routingNumber;
	private String transitNumber;
	private String userId;
	private String approvedByUserId;
	private String createdByUserId;
	private String accountType;
	private String subAccountId;
	private String dccRequestTime;
	private String dccReceivedRequestId;
	private String originatingPaymentId;
	private String fundTransferBatchId;
	private String chequeNumber;
	
	
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public String getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getProcessedDateTime() {
		return processedDateTime;
	}
	public void setProcessedDateTime(String processedDateTime) {
		this.processedDateTime = processedDateTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getmClass() {
		return mClass;
	}
	public void setmClass(String mClass) {
		this.mClass = mClass;
	}
	public String getCoinAddress() {
		return coinAddress;
	}
	public void setCoinAddress(String coinAddress) {
		this.coinAddress = coinAddress;
	}
	public String getCoinTransactionId() {
		return coinTransactionId;
	}
	public void setCoinTransactionId(String coinTransactionId) {
		this.coinTransactionId = coinTransactionId;
	}
	public String getConfirmations() {
		return confirmations;
	}
	public void setConfirmations(String confirmations) {
		this.confirmations = confirmations;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCashTransactionId() {
		return cashTransactionId;
	}
	public void setCashTransactionId(String cashTransactionId) {
		this.cashTransactionId = cashTransactionId;
	}
	public String getAccountAddress() {
		return accountAddress;
	}
	public void setAccountAddress(String accountAddress) {
		this.accountAddress = accountAddress;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getBankNumber() {
		return bankNumber;
	}
	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getOptionalReference() {
		return optionalReference;
	}
	public void setOptionalReference(String optionalReference) {
		this.optionalReference = optionalReference;
	}
	public String getPaymentTransferType() {
		return paymentTransferType;
	}
	public void setPaymentTransferType(String paymentTransferType) {
		this.paymentTransferType = paymentTransferType;
	}
	public String getOneTimeAuth() {
		return oneTimeAuth;
	}
	public void setOneTimeAuth(String oneTimeAuth) {
		this.oneTimeAuth = oneTimeAuth;
	}
	public String getPaymentEmail() {
		return paymentEmail;
	}
	public void setPaymentEmail(String paymentEmail) {
		this.paymentEmail = paymentEmail;
	}
	public String getPaymentPhone() {
		return paymentPhone;
	}
	public void setPaymentPhone(String paymentPhone) {
		this.paymentPhone = paymentPhone;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getDepositMethod() {
		return depositMethod;
	}
	public void setDepositMethod(String depositMethod) {
		this.depositMethod = depositMethod;
	}
	public String getDepositNotifyCode() {
		return depositNotifyCode;
	}
	public void setDepositNotifyCode(String depositNotifyCode) {
		this.depositNotifyCode = depositNotifyCode;
	}
	public String getOperatorComment() {
		return operatorComment;
	}
	public void setOperatorComment(String operatorComment) {
		this.operatorComment = operatorComment;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getOriginalDepositAmount() {
		return originalDepositAmount;
	}
	public void setOriginalDepositAmount(String originalDepositAmount) {
		this.originalDepositAmount = originalDepositAmount;
	}
	public String getOriginalDepositCurrency() {
		return originalDepositCurrency;
	}
	public void setOriginalDepositCurrency(String originalDepositCurrency) {
		this.originalDepositCurrency = originalDepositCurrency;
	}
	public String getCardPaymentCouponId() {
		return cardPaymentCouponId;
	}
	public void setCardPaymentCouponId(String cardPaymentCouponId) {
		this.cardPaymentCouponId = cardPaymentCouponId;
	}
	public String getDebitedDepositAmount() {
		return debitedDepositAmount;
	}
	public void setDebitedDepositAmount(String debitedDepositAmount) {
		this.debitedDepositAmount = debitedDepositAmount;
	}
	public String getReconciled() {
		return reconciled;
	}
	public void setReconciled(String reconciled) {
		this.reconciled = reconciled;
	}
	public String getPaymentBatchId() {
		return paymentBatchId;
	}
	public void setPaymentBatchId(String paymentBatchId) {
		this.paymentBatchId = paymentBatchId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getAmountSubmitToThirdParty() {
		return amountSubmitToThirdParty;
	}
	public void setAmountSubmitToThirdParty(String amountSubmitToThirdParty) {
		this.amountSubmitToThirdParty = amountSubmitToThirdParty;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getPaymentCouponId() {
		return paymentCouponId;
	}
	public void setPaymentCouponId(String paymentCouponId) {
		this.paymentCouponId = paymentCouponId;
	}
	public String getInstitutionNumber() {
		return institutionNumber;
	}
	public void setInstitutionNumber(String institutionNumber) {
		this.institutionNumber = institutionNumber;
	}
	public String getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	public String getTransitNumber() {
		return transitNumber;
	}
	public void setTransitNumber(String transitNumber) {
		this.transitNumber = transitNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getApprovedByUserId() {
		return approvedByUserId;
	}
	public void setApprovedByUserId(String approvedByUserId) {
		this.approvedByUserId = approvedByUserId;
	}
	public String getCreatedByUserId() {
		return createdByUserId;
	}
	public void setCreatedByUserId(String createdByUserId) {
		this.createdByUserId = createdByUserId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getSubAccountId() {
		return subAccountId;
	}
	public void setSubAccountId(String subAccountId) {
		this.subAccountId = subAccountId;
	}
	public String getDccRequestTime() {
		return dccRequestTime;
	}
	public void setDccRequestTime(String dccRequestTime) {
		this.dccRequestTime = dccRequestTime;
	}
	public String getDccReceivedRequestId() {
		return dccReceivedRequestId;
	}
	public void setDccReceivedRequestId(String dccReceivedRequestId) {
		this.dccReceivedRequestId = dccReceivedRequestId;
	}
	public String getOriginatingPaymentId() {
		return originatingPaymentId;
	}
	public void setOriginatingPaymentId(String originatingPaymentId) {
		this.originatingPaymentId = originatingPaymentId;
	}
	public String getFundTransferBatchId() {
		return fundTransferBatchId;
	}
	public void setFundTransferBatchId(String fundTransferBatchId) {
		this.fundTransferBatchId = fundTransferBatchId;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
}
