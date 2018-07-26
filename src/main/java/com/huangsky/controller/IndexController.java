package com.huangsky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Huangsky on 2018/7/26.
 */
@Controller
public class IndexController {
    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String index() {

        return "Hello NowCoder!";
    }

    @RequestMapping(path = {"/profile/{groudId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userid,
                          @PathVariable("groudId") String groudId,
                          @RequestParam(value = "type", defaultValue = "1") int type,
                          @RequestParam(value = "key", defaultValue = "zz", required = false) String key) {

        return String.format("Profile Page of %s/%d,t:%d k:%s", groudId, userid, type, key);

    }

}
