package com.web_client.spring.soap.api.util;


import com.baeldung.springsoap.gen.GetEmploymentRequest;

import com.web_client.spring.soap.api.entity.Employment;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component
public class EmploymentMapper {

    public Employment requestToEntity(GetEmploymentRequest request) throws ParseException {

        Employment employment = new Employment();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        employment.setNames(request.getNames());
        employment.setLastNames(request.getLastnames());
        employment.setCodTypeIdentification(request.getDocType());
        employment.setNumIdentification(request.getDocNumber());
        employment.setBirthDate(LocalDate.parse(request.getBirthDate(), formatter));
        employment.setEnjoyingDate((LocalDate.parse(request.getEnjoyingDate(), formatter)));
        employment.setJob(request.getJob());
        employment.setSalary(request.getSalary());


        return employment;

    }

}
