package io.github.guimatech.studious.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping(path = { "/dashboard", "/" })
    public String dashboard() {
        return "dashboard";
    }
}
