package com.ge.dw1;

import com.ge.dw1.resources.NotificationResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class DWService extends Service<DWConfiguration> {

	@Override
	public void initialize(Bootstrap<DWConfiguration> bootstrap) {
		// TODO Auto-generated method stub
		 bootstrap.setName("hello");

	}

	@Override
	public void run(DWConfiguration config, Environment environment) throws Exception {
		environment.addResource(new NotificationResource());
		

	}

	public static void main(String[] args) throws Exception {
		DWService dwService = new DWService();
		dwService.run(args);
	}
}
