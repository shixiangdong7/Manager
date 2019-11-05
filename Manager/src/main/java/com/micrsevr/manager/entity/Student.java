package com.micrsevr.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author shixiangdong
 * @create 2019-11-05 22:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {


    private Long id;

    private String name;

    private Integer gender;

    private Integer age;

}
