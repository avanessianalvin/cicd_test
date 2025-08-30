package com.sian.ci_cd.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Person {
    private long id;
    private String name;
}
