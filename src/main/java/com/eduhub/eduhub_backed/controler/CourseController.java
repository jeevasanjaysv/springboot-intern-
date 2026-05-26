package com.eduhub.eduhub_backed.controler;

import com.eduhub.eduhub_backed.components.CourseService;
import com.eduhub.eduhub_backed.components.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @Autowired
    private ProductService pro;

    @GetMapping("/cours")
    public String getcourse(){
        String c=service.getCourse();
        return  c;
    }

    @GetMapping("/pro")
    public  String products(){
        return pro.getProduct();
    }


}
