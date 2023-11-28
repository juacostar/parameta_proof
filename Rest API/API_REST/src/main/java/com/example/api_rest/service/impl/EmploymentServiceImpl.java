package com.example.api_rest.service.impl;

import com.example.api_rest.gen.GetEmploymentRequest;
import com.example.api_rest.gen.GetEmploymentResponse;
import com.example.api_rest.dto.CustomizedEmploymentResponse;
import com.example.api_rest.service.EmploymentService;
import com.example.api_rest.util.EmploymentMapper;
import com.example.api_rest.util.VerifyEmployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.text.ParseException;

@Service
public class EmploymentServiceImpl implements EmploymentService {

    @Autowired
    private EmploymentMapper mapper;

    @Autowired
    private Jaxb2Marshaller marshaller;

    @Autowired
    private VerifyEmployment verifyEmployment;

    @Override
    public CustomizedEmploymentResponse saveEmployment(GetEmploymentRequest request) {

        try {

            verifyEmployment.verifyRequest(request);
            verifyEmployment.validateDates(request);

            WebServiceTemplate template = new WebServiceTemplate(marshaller);
            GetEmploymentResponse response= (GetEmploymentResponse) template.marshalSendAndReceive("http://localhost:8081/ws", request);

            if(response.isSaved()) return mapper.entityToDTO(request);
            else throw  new Exception();
        } catch (ParseException e) {
           e.printStackTrace();
        } catch (NullPointerException nullPointerException){
            throw new NullPointerException();
        }catch (IllegalArgumentException illegalArgumentException){
            throw new IllegalArgumentException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
