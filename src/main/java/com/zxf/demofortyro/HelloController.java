package com.zxf.demofortyro;

import io.prometheus.client.Counter;
import io.prometheus.client.Histogram;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/api/greeting/bye/{personname}")
    public ResponseEntity<String> sayBye(@PathVariable String personname) {
        System.out.println(personname);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body("see you agian, " + personname);
    }
}
