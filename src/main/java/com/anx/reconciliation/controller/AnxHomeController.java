package com.anx.reconciliation.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anx.reconciliation.entity.TxTransaction;
import com.anx.reconciliation.service.BitcoinService;
import com.anx.reconciliation.service.EthereumService;
import com.anx.reconciliation.util.AnxUtil;

@Controller
public class AnxHomeController {

	@Autowired
	private BitcoinService bitcoinService;
	
	@Autowired
	private EthereumService ethereumService;
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/reconcile/ether")
	public String doEtherReconciliation() {
		List<TxTransaction> transactions = AnxUtil.importCsvFile();

		try {
			for(TxTransaction tran : transactions) {
				ethereumService.checkTransaction(tran);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	
	@GetMapping(value = "/reconcile/bitcoin")
	public String doBitcoinReconciliation() {
		bitcoinService.runBtcChecker();
		
		/*ProcessEngineConfiguration cfg = ProcessEngineFactory.getInstance();

		ProcessEngine processEngine = cfg.buildProcessEngine();

		RepositoryService repositoryService = processEngine.getRepositoryService();
		Deployment deployment = repositoryService.createDeployment().addClasspathResource("anx-reconciliation.bpmn20.xml")
				.deploy();

		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
				.deploymentId(deployment.getId()).singleResult();
		System.out.println("Found process definition : " + processDefinition.getName());

		RuntimeService runtimeService = processEngine.getRuntimeService();

		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("reconciliation");

		HistoryService historyService = processEngine.getHistoryService();
		List<HistoricActivityInstance> activities =
		  historyService.createHistoricActivityInstanceQuery()
		   .processInstanceId(processInstance.getId())
		   .finished()
		   .orderByHistoricActivityInstanceEndTime().asc()
		   .list();

		for (HistoricActivityInstance activity : activities) {
		  System.out.println(activity.getActivityId() + " took "
		    + activity.getDurationInMillis() + " milliseconds");
		}
		*/
		return "index";
	}
}
