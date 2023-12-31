package com.example.api_rest.controller;

import com.example.api_rest.gen.GetEmploymentRequest;
import com.example.api_rest.service.EmploymentService;
import com.example.api_rest.util.ErrorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmploymentController {

    @Autowired
    private EmploymentService service;

    @Autowired
    private ErrorMapper mapper;

    @PostMapping(value = "/employments/employee/add")
    public @ResponseBody ResponseEntity<Object> saveEmployee(@RequestBody GetEmploymentRequest request){

        try{
            return ResponseEntity.ok().body(service.saveEmployment(request));
        }catch (NullPointerException nullPointerException){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mapper.createError("Validar campos, campos vacíos"));
        }
        catch (IllegalArgumentException illegalArgumentException){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mapper.createError("Validar fechas, el empleado debe ser mayor de edad"));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mapper.createError("No se guardo el cliente, por favor verificar el servicio SOAP"));
        }

    }

}
