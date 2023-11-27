package com.web_client.spring.soap.api.util;


import com.baeldung.springsoap.gen.GetEmploymentRequest;

import com.web_client.spring.soap.api.entity.Employment;
import org.springframework.stereotype.Component;

@Component
public class EmploymentMapper {

    public Employment requestToEntity(GetEmploymentRequest request){

        Employment employment = new Employment();

        employment.setNames(request.getNames());
        employment.setLastNames(request.getLastnames());
        employment.setCodTypeIdentification(request.getDocType());
        employment.setNumIdentification(request.getDocNumber());
        employment.setBirthDate(request.getBirthDate());
        employment.setEnjoyingDate(request.getEnjoyingDate());
        employment.setJob(request.getJob());
        employment.setSalary(request.getSalary());


        return employment;

    }

}
