package cn.yswu.controller;

import cn.yswu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author yswu
 * @date 2021-07-06 14:40
 */
@Controller
public class I18NController {

    @RequestMapping("i18n")
    public String i18n(User user) {
        return "login";
    }

    @RequestMapping("i18n/{language}_{country}")
    public String changeLocale(@PathVariable("language") String language,
                               @PathVariable("country") String country,
                                HttpServletRequest request,
                                HttpServletResponse response,
                                @Autowired SessionLocaleResolver localeResolver) {

        Locale local = new Locale(language,country);
        localeResolver.setLocale(request,response,local);
        return "login";


    }

}
