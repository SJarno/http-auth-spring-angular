package com.sjarno.springangularsecurity;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:4200") // for dev
@RestController
public class UiController {

    @RequestMapping("/resource")
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Heippa maailma");
        return model;
    }
    @RequestMapping("/user")
    public Principal getUserPrincipal(Principal user) {
        return user;
    }
    
}
