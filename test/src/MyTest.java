import com.zkhr.service.one2many.OrderService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by zhaoshuai on 2017/2/9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml","classpath*:spring-mvc.xml"})

public class MyTest {

    @Autowired
    private WebApplicationContext wac;



    private MockMvc mockMvc;



    @Before
    public void setup(){

        this.mockMvc = webAppContextSetup(this.wac).build();

    }



    @Test
    public void testOrderSave() throws Exception{

        this.mockMvc.perform(get("/saveOrder"));

    }
}
