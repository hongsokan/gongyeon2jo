package com.gongyeon2jo.performance.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "performance")
public class Performance {

    @Id
    private long performanceId;
    private String displayId;
    private String displayName;
    private String displayDate;
    private long runtime;
    private String company;
    private String price;
    private String story;
    private String question;
    private String phone;
    private String announcement;
    private String poster;

}
