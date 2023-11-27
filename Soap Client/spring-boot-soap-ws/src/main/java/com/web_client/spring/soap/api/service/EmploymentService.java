package com.web_client.spring.soap.api.service;


import com.baeldung.springsoap.gen.GetEmploymentRequest;
import com.baeldung.springsoap.gen.GetEmploymentResponse;

public interface EmploymentService {

    GetEmploymentResponse saveEmployment(GetEmploymentRequest request);
}
