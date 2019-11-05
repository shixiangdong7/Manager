package com.micrsevr.manager.dao;

import com.micrsevr.manager.entity.Student;

@org.apache.ibatis.annotations.Mapper
public interface StudentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}