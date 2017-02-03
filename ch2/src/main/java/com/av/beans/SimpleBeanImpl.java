package com.av.beans;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by alexey on 03.02.17.
 */
public class SimpleBeanImpl implements SimpleBean {

    protected Logger logger = LoggerFactory.getLogger(SimpleBeanImpl.class);

    protected String message;

    public void seyHello() {
        logger.info("Hello from bean " + SimpleBeanImpl.class.getCanonicalName() + " " + message);

    }

    public void setMessage(String message) {
        this.message = message;
    }
}
