package com.itheima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: 齐烟九点天踦爵
 * Time: 2019/11/16 16:41
 * Description:
 */
@Controller
public class QuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "hello String3 Boot";
    }
}
