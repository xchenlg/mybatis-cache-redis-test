package sy.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sy.model.User;
import sy.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml",
        "classpath:spring-redis.xml" })
public class TestRedis {

    private static final Logger logger = Logger.getLogger(TestRedis.class);

    @Autowired
    private UserServiceI userService;

    @Test
    public void test() throws InterruptedException {
//        User u = userService.getUserById("1");
//        System.out.println(u.getName());
//        System.out.println("===============");
//        userService.getUserById("1");
        userService.getAll();
        System.out.println("==========");
        userService.getAll();
    }

}
