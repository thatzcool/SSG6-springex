package com.ssg.springex.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * packageName   : com.ssg.springex.sample
 * fileName      : SampleService
 * author        : a
 * date          : 2025-04-10
 * description   :
 * =================================================
 * DATE             AUTHOR             NOTE
 * -------------------------------------------------
 * 2025-04-10        a
 */
@ToString
@Service
public class SampleService {

    @Autowired
    private SampleDAO1 sampleDAO;
}
