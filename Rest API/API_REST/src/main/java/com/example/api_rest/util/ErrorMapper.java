package com.example.api_rest.util;

import com.example.api_rest.dto.ErrorResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ErrorMapper {

    public ErrorResponse createError(String message){

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setLocalDate(LocalDate.now());
        errorResponse.setError(message);

        return errorResponse;
    }

}
