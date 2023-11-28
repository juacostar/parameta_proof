package com.example.api_rest.service;

import com.example.api_rest.gen.GetEmploymentRequest;
import com.example.api_rest.dto.CustomizedEmploymentResponse;

public interface EmploymentService {

    CustomizedEmploymentResponse saveEmployment(GetEmploymentRequest request);
}
