package com.micrsevr.manager.controller;

import com.micrsevr.manager.sevice.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shixiangdong
 * @create 2019-11-05 21:42
 */

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @org.springframework.beans.factory.annotation.Autowired
    StudentService studentService;


    @RequestMapping("/getString")
    @org.springframework.web.bind.annotation.ResponseBody
    public Object selectById(Long id) {
        return studentService.selectById(id);
    }


}
