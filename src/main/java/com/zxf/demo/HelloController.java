package com.zxf.demo;

import io.micrometer.core.instrument.MeterRegistry;
import io.prometheus.client.CollectorRegistry;
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

//    final Counter counter;
    io.micrometer.core.instrument.Counter counter1;

    public HelloController(CollectorRegistry collectorRegistry, MeterRegistry meterRegistry) {
//        counter = Counter.build()
//                .name("requests_total").help("Total number of requests.").register(collectorRegistry);
        counter1 = meterRegistry.counter("test_request_total", "db", "users");
    }

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

    @GetMapping("/hello")
    String home() {
        // Increase the counter metric
//        counter.inc();
        counter1.increment();
        // Start the histogram time
            return "Hello World!";
    }

}
