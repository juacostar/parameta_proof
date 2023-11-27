package com.web_client.spring.soap.api.rest;

import com.baeldung.springsoap.gen.GetEmploymentRequest;
import com.baeldung.springsoap.gen.GetEmploymentResponse;
import com.web_client.spring.soap.api.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class SoapClientResource {

	@Autowired
	private EmploymentService service;

	private static final String NAMESPACE = "http://www.baeldung.com/springsoap/gen";


	@PayloadRoot(namespace = NAMESPACE, localPart = "GetEmploymentRequest")
	@ResponsePayload
	public GetEmploymentResponse getLoanStatus(@RequestPayload GetEmploymentRequest request) {
		//return service.checkLoanEligibility(request);
		return service.saveEmployment(request);
	}

}
