package org.test.services.demoservice;

import javax.jws.WebService;

import org.test.entities.demo.EchoRequestType;
import org.test.entities.demo.EchoResponseType;

@WebService(serviceName="DemoService", endpointInterface="org.test.services.demoservice.DemoService",
targetNamespace="http://test.org/services/DemoService/", portName="DemoServicePort", name="DemoServiceImpl")
public class DemoServiceImpl implements DemoService {

	@Override
	public EchoResponseType echo(EchoRequestType parameters) {
		EchoResponseType response = new EchoResponseType();
		response.setOut(parameters.getIn());
		return response;
	}

}
