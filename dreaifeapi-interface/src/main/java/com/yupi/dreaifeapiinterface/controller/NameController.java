package com.yupi.dreaifeapiinterface.controller;

import com.yupi.dreaifeapiclientsdk.model.User;
import com.yupi.dreaifeapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 名称 API
 *
 * @author dreaife
 */
@RestController
@RequestMapping("name")
public class NameController {
    @GetMapping("/")
    public String getNameByGet(String name,HttpServletRequest request) {
        System.out.println(request.getHeader("name"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
        // 1.拿到这五个我们可以一步一步去做校验,比如 accessKey 我们先去数据库中查一下
        // 从请求头中获取参数
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        // 不能直接获取秘钥
//        //        String secretKey = request.getHeader("secretKey");
//
//        // 2.校验权限,这里模拟一下,直接判断 accessKey 是否为"dreaife",实际应该查询数据库验证权限
//        if (!accessKey.equals("dreaife")){
//            throw new RuntimeException("无权限");
//        }
//
//        // 3.校验一下随机数,因为时间有限,就不带大家再到后端去存储了,后端存储用hashmap或redis都可以
//        // 校验随机数,模拟一下,直接判断nonce是否大于10000
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//
//        // TODO 校验时间戳与当前时间的差距
////        if (timestamp) {}
//
//        // 签名校验
//        String serverSign = SignUtils.genSign(body,"abcdefgh");
//        if(!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }

        String result = "POST 用户名字是" + user.getUsername();
        return result;
    }
}
