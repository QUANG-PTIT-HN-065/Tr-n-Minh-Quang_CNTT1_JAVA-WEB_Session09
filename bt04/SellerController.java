package com.restaurant.session09.bt04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/register")
@SessionAttributes("sellerForm")
public class SellerController {

    @ModelAttribute("sellerForm")
    public SellerForm initForm() {
        return new SellerForm();
    }

    @GetMapping("/step1")
    public String step1() {
        return "step1";
    }

    @PostMapping("/step1")
    public String handleStep1(@ModelAttribute("sellerForm") SellerForm form) {
        return "redirect:/register/step2";
    }

    @GetMapping("/step2")
    public String step2() {
        return "step2";
    }

    @PostMapping("/step2")
    public String handleStep2(@ModelAttribute("sellerForm") SellerForm form) {
        return "redirect:/register/step3";
    }

    @GetMapping("/step3")
    public String step3() {
        return "step3";
    }

    @PostMapping("/finish")
    public String finish(@ModelAttribute("sellerForm") SellerForm form,
                         SessionStatus status) {
        System.out.println("Lưu DB: " + form.getFullName());

        status.setComplete();

        return "redirect:/success";
    }
}