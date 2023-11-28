package com.example.api_rest.util;

import com.example.api_rest.gen.GetEmploymentRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Component
public class VerifyEmployment {

    public void verifyRequest(GetEmploymentRequest request) throws NullPointerException{

        if(request.getNames()==null || StringUtils.isEmpty(request.getNames())){
           throw new NullPointerException();
        }
        if(request.getLastnames()==null || StringUtils.isEmpty(request.getLastnames())){
            throw new NullPointerException();
        }
        if(request.getDocType()==null || StringUtils.isEmpty(request.getDocType())){
            throw new NullPointerException();
        }
        if(request.getDocNumber()==null || StringUtils.isEmpty(request.getDocNumber())){
            throw new NullPointerException();
        }
        if(request.getBirthDate()==null || StringUtils.isEmpty(request.getBirthDate())){
            throw new NullPointerException();
        }
        if(request.getEnjoyingDate()==null || StringUtils.isEmpty(request.getEnjoyingDate())){
            throw new NullPointerException();
        }
        if(request.getJob()==null || StringUtils.isEmpty(request.getJob())){
            throw new NullPointerException();
        }
        if(request.getSalary()==0.0 || StringUtils.isEmpty(request.getSalary())){
            throw new NullPointerException();
        }
    }

    public void validateDates(GetEmploymentRequest request) throws IllegalArgumentException, ParseException{

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        LocalDate birthDateFormatted = LocalDate.parse(request.getBirthDate(), formatter);

        Period period = Period.between(birthDateFormatted, localDate);

        int years = period.getYears();

        if(years < 18) throw  new IllegalArgumentException();

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.parse(request.getBirthDate().toString());
        format.parse(request.getEnjoyingDate().toString());



    }

}
