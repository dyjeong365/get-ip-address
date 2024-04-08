package com.dyjeong365.ip_address.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IpAddressController {
    @GetMapping("/ip")
    public String getIpAddress(HttpServletRequest request) {
        return "My IPv4 Address: " + request.getRemoteAddr();
    }
}
