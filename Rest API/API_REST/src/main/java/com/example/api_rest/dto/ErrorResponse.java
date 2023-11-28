package com.example.api_rest.dto;

import java.time.LocalDate;

public class ErrorResponse {

    private LocalDate localDate;

    private String error;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
