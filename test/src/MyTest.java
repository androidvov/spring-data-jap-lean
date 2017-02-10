import com.alibaba.fastjson.JSON;
import com.zkhr.model.one2many.Order;
import com.zkhr.service.one2many.OrderService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.security.PublicKey;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

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

    @Autowired
    private OrderService orderService;



    @Before
    public void setup(){

        this.mockMvc = webAppContextSetup(this.wac).build();

    }


    /**
     * 测试Service
     */
    @Test
    public void testOrderService(){

        Order order = orderService.findOrderById();
        System.out.println(JSON.toJSONString(order));
    }


    /**
     * 无参数 json 返回测试
     * @throws Exception
     */
    @Test
    public void testOrderSave() throws Exception{

        this.mockMvc.perform(get("/getUsers")).andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.username").value("zhangsan"))
        ;

    }


    /**Post JSON 数据单元测试
     *
     * @throws Exception
     */
    @Test
    public void testParams() throws Exception{


        this.mockMvc.perform(post("/getUserWithParam").contentType(MediaType.APPLICATION_JSON).content("{'name':'zhsnagsan'}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username").value("lisi"));






    }



}
