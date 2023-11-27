package com.web_client.spring.soap.api.repository;


import com.web_client.spring.soap.api.entity.Employment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentsRepository extends CrudRepository<Employment,String> {

}
