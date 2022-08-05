package com.example.demo.controller;


import com.example.demo.tools.Constant;
import com.example.demo.tools.TokenTools;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wzq
 */

@RestController
@RequestMapping(Constant.path + "/account")
public class AccountController {
    @PostMapping("/login")
    String login(Map<String, String> body) {
        String userName = body.get("username");
        String password = body.get("password");
        String token = TokenTools.createToken(userName, password);
        return token;
    }

}
