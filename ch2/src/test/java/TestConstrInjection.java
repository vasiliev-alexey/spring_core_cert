import com.av.beans.ComplexBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alexey on 03.02.17.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//@ContextConfiguration(locations = {"classpath:config-example.xml"})
public class TestConstrInjection {

    @Test
    public  void  testInjectBean() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config-example.xml");
        ComplexBean complexBean = ctx.getBean("complexBean" , ComplexBean.class);
        complexBean.testInjectfromConstructorBean();
        complexBean.testInjectfromSetterBean();
        complexBean.testInjectList();
    }

}
