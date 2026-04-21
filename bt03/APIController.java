package com.restaurant.session09.bt03;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class APIController {
    @PostMapping("/change-theme")
    public String changeTheme(@RequestParam("theme") String theme,
                              HttpServletResponse response) {

        Cookie cookie = new Cookie("theme", theme);

        cookie.setMaxAge(30 * 24 * 60 * 60);

        cookie.setHttpOnly(true);

        cookie.setPath("/");

        response.addCookie(cookie);

        return "redirect:/";
    }
}
