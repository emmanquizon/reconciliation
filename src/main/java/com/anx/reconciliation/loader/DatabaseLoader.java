package com.anx.reconciliation.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anx.reconciliation.entity.Payment;
import com.anx.reconciliation.entity.Transaction;
import com.anx.reconciliation.repository.PaymentRepository;
import com.anx.reconciliation.repository.TransactionRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {


	private TransactionRepository  transactionRepository;
	private PaymentRepository  paymentRepository;
	
	@Autowired
	public DatabaseLoader(TransactionRepository transactionRepository, PaymentRepository paymentRepository) {
		this.transactionRepository = transactionRepository;
		this.paymentRepository = paymentRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Transaction t = new Transaction("transactionId", "versionAccountIdAmount", "ccy", "fee", "ipAddress", "processedDateTimeReceivedDateTimeTransactionState", "transactionType", "mClass", "userPaymentMethodId", "coinAddressCoinConfirmations", "coinTransactionId", "fillId", "orderId", "confirmationId", "balanceAfter", "balanceBefore", "reversalOriginalBalance", "paymentTransferType", "subAccountId", "siteEnum", "couponId", "uuid", "tradeId", "orderOutstandingFixedAmount", "orderSettlementCCyExecutedAmount", "orderTradedCcyExecutedAmount", "externalSystemUserAccountId", "externalSystemUserAccountName", "operatorComment", "operatorUserName", "operatorId", "originatingTransactionId", "subAccountBalanceBefore", "subAccountBalanceAfter", "reversalOriginalSubAccountBalanceTradeUuidd", "ccReceivedRequestUuid", "batchSendId", "fundTransferBatchId");
		Payment p = new Payment("paymentId", "version", "amount", "ccy", "paymentState", "paymentType", "processedDateTime", "userName", "mClass", "coinAddress", "coinTransactionId", "confirmations", "accountNumber", "bankName", "cashTransactionId", "accountAddress", "bankAddress", "bankNumber", "branchName", "method", "optionalReference", "paymentTransferType", "oneTimeAuth", "paymentEmail", "paymentPhone", "approvedBy", "depositMethod", "depositNotifyCode", "operatorComment", "uuid", "couponId", "fee", "name", "cardId", "tradeId", "originalDepositAmount", "originalDepositCurrency", "cardPaymentCouponId", "debitedDepositAmount", "reconciled", "paymentBatchId", "transactionId", "amountSubmitToThirdParty", "invoiceId", "paymentCouponId", "institutionNumber", "routingNumber", "transitNumber", "userId", "approvedByUserId", "createdByUserId", "accountType", "subAccountId", "dccRequestTime", "dccReceivedRequestId", "originatingPaymentId", "fundTransferBatchId", "chequeNumber");
		
		transactionRepository.save(t);
		paymentRepository.save(p);

	}

}
