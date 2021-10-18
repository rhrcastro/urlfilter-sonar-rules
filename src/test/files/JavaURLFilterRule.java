package com.research.tempest.springapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

@RestController
@RequestMapping(value="/apresentacao")
public class JavaURLFilterCheck {
    
    @RequestMapping(value="/logRequest", method=RequestMethod.GET)
    public Boolean logRequest(ServletRequest request, ServletResponse response) {
        String url = ((HttpServletRequest) request).getRequestURL(); // Noncompliant
        if (url.endsWith(".css") || url.endsWith(".js") || url.endsWith(".png") || url.endsWith(".gif")) {
            return false;
        }
        return true;
    }
}