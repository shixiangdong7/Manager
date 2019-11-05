package com.micrsevr.manager.sevice;

import com.micrsevr.manager.entity.*;
/**
 * @author shixiangdong
 * @create 2019-11-05 22:28
 */
@org.springframework.stereotype.Service
public interface StudentService {

    Student selectById(Long id);

}
