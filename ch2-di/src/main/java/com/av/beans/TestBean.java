package com.av.beans;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by vasiliev-alexey on 04.02.17.
 */
public class TestBean {

    private Logger logger = LoggerFactory.getLogger(TestBean.class);

    public void callMe() {
        logger.info("test bean called");

    }

}
