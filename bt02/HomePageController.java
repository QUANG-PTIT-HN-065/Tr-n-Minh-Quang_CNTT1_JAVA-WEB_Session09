package com.restaurant.session09.bt02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RequestMapping
@Controller
public class HomePageController {
    @GetMapping("/home")
    public String homePage(
            @CookieValue(value = "guest_name", required = false, defaultValue = "Khách lạ")
            String guestName,
            Model model) {

        model.addAttribute("msg", "Chào mừng " + guestName + " trở lại!");

        return "home-page";
    }
}
