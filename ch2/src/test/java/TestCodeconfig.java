import com.av.beans.ComplexBean;
import com.av.beans.SimpleBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vasiliev-alexey on 03.02.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations = {"classpath:code-config.xml"})
public class TestCodeconfig {

    @Qualifier("simpleBeanOne")
    @Autowired
    private  SimpleBean simpleBean ;

    @Test
    public void testCodeConfig() {

        simpleBean.seyHello();


    }

    @Test
     public   void testComplexBean() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:config-example.xml");

        ComplexBean complexBean = context.getBean("complexBean" , ComplexBean.class);
        complexBean.testInjectfromConstructorBean();
        complexBean.testInjectfromSetterBean();
   //     complexBean.testInjectList();
        context.registerShutdownHook();
    }


    @Test
    public void testTotalConfig() {



    }


}
