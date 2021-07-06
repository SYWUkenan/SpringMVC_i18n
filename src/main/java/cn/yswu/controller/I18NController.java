package cn.yswu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yswu
 * @date 2021-07-06 14:40
 */
@Controller
public class I18NController {

    @RequestMapping("i18n")
    public  String i18n(){
        return "login";
    }
}
