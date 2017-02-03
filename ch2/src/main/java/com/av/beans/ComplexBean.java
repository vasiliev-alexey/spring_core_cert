package com.av.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;


/**
 * Created by alexey on 03.02.17.
 */
public class ComplexBean implements InitializingBean  , DisposableBean{

    private Logger logger = LoggerFactory.getLogger(ComplexBean.class);

    private SimpleBean simpleBean;
    private SimpleBean simpleBeanProperty;
    private List<SimpleBean> simpleBeanList;


    public ComplexBean(SimpleBean simpleBean)  {
        logger.info("-->> Call construct");
        this.simpleBean = simpleBean;
        logger.info("<<-- Call construct");
    }





    public  void testInjectfromConstructorBean() {
        logger.info("call dependency bean from constructor");
        simpleBean.seyHello();

    }

    public  void testInjectfromSetterBean() {
        logger.info("call dependency bean from setter");
        simpleBeanProperty.seyHello();

    }

    public  void testInjectList() {
        logger.info("call dependency from list");
        for ( SimpleBean simpleBean: simpleBeanList) {
            simpleBean.seyHello();
        }
    }



    @Required
    public void setSimpleBeanProperty(SimpleBean simpleBeanProperty) {
        logger.info("-->> Call setter");
        this.simpleBeanProperty = simpleBeanProperty;
        logger.info("<<-- Call setter");
    }

    public void setSimpleBeanList(List<SimpleBean> simpleBeanList) {
        this.simpleBeanList = simpleBeanList;
    }

    public void initMethod() {
        logger.info("init method called");
    }

    public void afterPropertiesSet() throws Exception {
        logger.info("init method called from InitializingBean");
    }
   @PostConstruct
    private void postConstructMethod() {
        logger.info("private init method called from postConstructMethod");
    }


    public void destroy() throws Exception {
        logger.info("destroy() from iface method called");
    }

    public void destroyMethod() throws Exception {
        logger.info("destroyMethod()   method called");
    }
    @PreDestroy
    public void preDestroyMethod() throws Exception {
        logger.info("preDestroyMethod()   method called");
    }
}
