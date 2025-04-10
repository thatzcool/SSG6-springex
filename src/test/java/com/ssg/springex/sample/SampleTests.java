package com.ssg.springex.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {
    @Autowired
    private SampleService sampleService;

    @Test
    public void testService() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

}

//SampleTests
//SampleService 멤버 변수로 선언
//@Autowire 어노테이션 : 스프링에서 사용하는 의존성 주입 어노테이션
//'만약 해당 타입의 빈(Bean)이 존재하면 여기에 주입해 주기를 원해~" 의미
//
//@ExtendWith(SpringExtension.class)
//Junit5버전에서 spring-test 를 사용하기 위한 설정
//
//@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/root-context.xml")
//스프링 설정 정보를 로딩하기 위해 설정