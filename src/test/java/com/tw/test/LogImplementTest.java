package com.tw.test;

import com.tw.LogImplement;
import com.tw.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebConfig.class)
public class LogImplementTest {

    @Autowired
    private LogImplement logImplement;

    @Test
    public void testLogImplementBean() throws Exception {
        assertNotNull(logImplement);
    }
}
