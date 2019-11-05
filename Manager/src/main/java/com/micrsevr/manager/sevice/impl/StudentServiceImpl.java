package com.micrsevr.manager.sevice.impl;

/**
 * @author shixiangdong
 * @create 2019-11-05 22:29
 */
@org.springframework.stereotype.Service
public class StudentServiceImpl implements com.micrsevr.manager.sevice.StudentService {

    @org.springframework.beans.factory.annotation.Autowired
    com.micrsevr.manager.dao.StudentMapper studentMapper;


    @Override
    public com.micrsevr.manager.entity.Student selectById(Long id) {
        return  studentMapper.selectByPrimaryKey(id);
    }
}
