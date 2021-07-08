package cn.yswu.controller;

import cn.yswu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Locale;

/**
 * @author yswu
 * @date 2021-07-08 14:45
 */
@Controller
public class UserController {

    @Autowired
    MessageSource messageSource;

    @PostMapping("/login")
    public String login(@Valid User user,
                        BindingResult bindingResult,
                        Model model,
                        Locale locale){
        if(bindingResult.hasErrors()){
            return "login";
        }



        if(!user.getEmail().equals("123@qq.com")&&!user.getPassword().equals("1234546")){
            String login_error = messageSource.getMessage("login_error", new Object[]{user.getEmail(),user.getPassword()}, locale);
            model.addAttribute("errorMsg",login_error);
            return "login";
        }

        return "admin";

    }
}
