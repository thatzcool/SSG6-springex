package com.ssg.springex.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TimeMapperTests {
    @Autowired(required = false)
    private TimeMapper mapper1;

    @Autowired(required = false)
    private TimeMapper2 mapper;

    @Test
    public void TimpeMappertest() {
        log.info(mapper1.getTime());
    }

    @Test
    public void TimpeMappertest1() {
         log.info(mapper.getNow());
    }


}
