package com.zxf.demo;

import io.prometheus.client.CollectorRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoForTyroApplication {

	@Autowired
	CollectorRegistry collectorRegistry;

//	// Define a counter metric for /prometheus
//	final Counter requests = Counter.build()
//			.name("requests_total").help("Total number of requests.").register(collectorRegistry);
//	// Define a histogram metric for /prometheus
//	static final Histogram requestLatency = Histogram.build()
//			.name("requests_latency_seconds").help("Request latency in seconds.").register();

	public static void main(String[] args) {
		SpringApplication.run(DemoForTyroApplication.class, args);
	}

//	@GetMapping("/hello")
//	String home() {
//		// Increase the counter metric
//		requests.inc();
//		// Start the histogram timer
//		Histogram.Timer requestTimer = requestLatency.startTimer();
//		try {
//			return "Hello World!";
//		} finally {
//			// Stop the histogram timer
//			requestTimer.observeDuration();
//		}
//	}

}
