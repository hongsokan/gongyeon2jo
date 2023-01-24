package com.gongyeon2jo.sample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity(name = "sample")
public class Sample {

    @Id
    private int sampleId;
    private String sampleName;

}
