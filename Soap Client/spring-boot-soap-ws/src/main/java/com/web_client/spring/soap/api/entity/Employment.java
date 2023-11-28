package com.web_client.spring.soap.api.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Employment")
public class Employment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "names")
    private String names;

    @Column(name = "lastnames")
    private String lastNames;

    @Column(name = "cod_type_identification")
    private String codTypeIdentification;

    @Column(name = "num_identificarion")
    private String numIdentification;


    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "enjoying_date")
    private LocalDate enjoyingDate;

    @Column(name = "job")
    private String job;

    @Column(name = "salary")
    private Double salary;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getCodTypeIdentification() {
        return codTypeIdentification;
    }

    public void setCodTypeIdentification(String codTypeIdentification) {
        this.codTypeIdentification = codTypeIdentification;
    }

    public String getNumIdentification() {
        return numIdentification;
    }

    public void setNumIdentification(String numIdentification) {
        this.numIdentification = numIdentification;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getEnjoyingDate() {
        return enjoyingDate;
    }

    public void setEnjoyingDate(LocalDate enjoyingDate) {
        this.enjoyingDate = enjoyingDate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
