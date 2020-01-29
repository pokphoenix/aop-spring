package com.poktest.springaop.service;

import com.poktest.springaop.annotation.TrackTime;
import com.poktest.springaop.repo.Dao1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomething(){
        String value = dao1.retrieveSomething();
        logger.info("In Business - {}", value);
        return value;
    }
}
