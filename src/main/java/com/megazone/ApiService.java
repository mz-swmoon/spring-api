package com.megazone;


import com.megazone.entity.EduEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {

//	@Autowired eduRepository eduRepository;

    public List<EduEntity> findAll() {
        List<EduEntity> eduEntities = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            EduEntity eduEntity = new EduEntity();
            eduEntity.setAge(10 + i);
            eduEntity.setGuid("abcde-dasd-asd" + i);
            eduEntity.setPhone("010000000" + i);
            eduEntity.setId(i);
            eduEntities.add(eduEntity);
        }

        return eduEntities;
    }


}
