package com.zxf.demofortyro;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping("/api/greeting/say/{personname}")
    public ResponseEntity<String> sayHi(@PathVariable String personname) {
        System.out.println(personname);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body("hi, " + personname);
    }

}
