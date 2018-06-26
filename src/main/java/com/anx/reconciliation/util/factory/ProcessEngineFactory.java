package com.anx.reconciliation.util.factory;

import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;

public class ProcessEngineFactory {
	
	private static ProcessEngineConfiguration cfg;

	public static ProcessEngineConfiguration getInstance() {
		if(cfg == null) {
			
			cfg = new StandaloneProcessEngineConfiguration()
					.setJdbcUrl("jdbc:mongo://localhost:27017/flowable;DB_CLOSE_DELAY=-1")
					.setJdbcDriver("mongodb.jdbc.MongoDriver")
					.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
		}
		return cfg;
		
	}
}
