package com.megazone;

import com.megazone.entity.EduEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RefreshScope
@RestController
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(RestController.class);


    @Autowired
    ApiService mysqlservice;
    

    @Value("${spring.application.name}")
    private String name;


    @RequestMapping(value = {"/config"}, method = RequestMethod.GET)
    public Map config(HttpServletRequest httpServletRequest) {
        Map map = new HashMap();
        map.put("spring.application.name",name);
        return map;
    }
    
    @GetMapping("/users")
    public List<EduEntity> getAllData() {
    	return mysqlservice.findAll();
    }



    
}
