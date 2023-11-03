package com.bezkoder.spring.files.csv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NseData {

    @Id
    private String symbol;
    private long strike;
    private float ltp;
    private float chng;
    private float cngPer;
    private float open;
    private float high;
    private float low;
    private long volume;
    private long openInterest;
    private float underlyingValue;


}
