package com.yupi.dreaifeapiinterface;

import com.yupi.dreaifeapiclientsdk.client.dreaifeApiClient;
import com.yupi.dreaifeapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DreaifeapiInterfaceApplicationTests {

    @Autowired
    private dreaifeApiClient ApiClient;
    @Test
    void contextLoads() {
        // 调用yuApiClient的getNameByGet方法，并传入参数"dreaife"，将返回的结果赋值给result变量
        String result = ApiClient.getNameByGet("dreaife");
        User user = new User();
        user.setUsername("dreaife");
        // 调用ApiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
        String usernameByPost = ApiClient.getUserNameByPost(user);
        // 打印result变量的值
        System.out.println(result);
        // 打印usernameByPost变量的值
        System.out.println(usernameByPost);
    }

}
