package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.demo.entity.enums.ProblemStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProblemDto implements Serializable {

    private String problemName;
    private String problemDetail;
    private ProblemStatus problemStatus;

    @JsonProperty("pId")
    private Long pId;

    private int status;
    private Date creationDate;
}
