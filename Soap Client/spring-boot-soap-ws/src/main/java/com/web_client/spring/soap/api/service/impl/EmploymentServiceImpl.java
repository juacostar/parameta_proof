package com.web_client.spring.soap.api.service.impl;

import com.baeldung.springsoap.gen.GetEmploymentRequest;
import com.baeldung.springsoap.gen.GetEmploymentResponse;


import com.web_client.spring.soap.api.entity.Employment;
import com.web_client.spring.soap.api.repository.EmploymentsRepository;
import com.web_client.spring.soap.api.service.EmploymentService;
import com.web_client.spring.soap.api.util.EmploymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



;

@Service
public class EmploymentServiceImpl implements EmploymentService {

    @Autowired
    private EmploymentsRepository repository;

    @Autowired
    private EmploymentMapper mapper;

    @Override
    public GetEmploymentResponse saveEmployment(GetEmploymentRequest request) {
        GetEmploymentResponse response = new GetEmploymentResponse();

        try{
            Employment employment = mapper.requestToEntity(request);
            repository.save(employment);
            response.setSaved(true);
            return  response;
        }catch(Exception e){
            response.setSaved(false);
            return response;
        }

    }
}
