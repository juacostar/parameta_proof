package com.example.api_rest.util;

import com.example.api_rest.gen.GetEmploymentRequest;
import com.example.api_rest.dto.CustomizedEmploymentResponse;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Component
public class EmploymentMapper {

    public CustomizedEmploymentResponse entityToDTO(GetEmploymentRequest request) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.now();


        CustomizedEmploymentResponse customizedEmploymentResponse = new CustomizedEmploymentResponse();
        customizedEmploymentResponse.setNames(request.getNames());
        customizedEmploymentResponse.setLastnames(request.getLastnames());
        customizedEmploymentResponse.setDocType(request.getDocType());
        customizedEmploymentResponse.setDocNumber(request.getDocNumber());
        customizedEmploymentResponse.setBirthDate(request.getBirthDate());
        customizedEmploymentResponse.setEnjoyingDate(request.getEnjoyingDate());
        customizedEmploymentResponse.setJob(request.getJob());
        customizedEmploymentResponse.setSalary(request.getSalary());

        LocalDate birthDateFormatted = LocalDate.parse(request.getBirthDate(), formatter);
        LocalDate enjoyingDateFormatted = LocalDate.parse(request.getEnjoyingDate(), formatter);

        customizedEmploymentResponse.setJobTime(setDateDifference(birthDateFormatted, localDate));
        customizedEmploymentResponse.setAge(setDateDifference(enjoyingDateFormatted, localDate));

        return customizedEmploymentResponse;
    }

    public String setDateDifference(LocalDate startDate, LocalDate endDate){

        String difference = "";


        Period period = Period.between(startDate, endDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();


        difference = years + " años, "  + months + " meses y " + days + " días";
        return difference;
    }

}
