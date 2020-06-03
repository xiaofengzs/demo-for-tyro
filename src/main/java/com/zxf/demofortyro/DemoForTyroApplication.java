package com.zxf.demofortyro;

import io.prometheus.client.Counter;
import io.prometheus.client.Histogram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoForTyroApplication {

	// Define a counter metric for /prometheus
	static final Counter requests = Counter.build()
			.name("requests_total").help("Total number of requests.").register();
	// Define a histogram metric for /prometheus
	static final Histogram requestLatency = Histogram.build()
			.name("requests_latency_seconds").help("Request latency in seconds.").register();

	public static void main(String[] args) {
		SpringApplication.run(DemoForTyroApplication.class, args);
	}

	@GetMapping("/")
	String home() {
		// Increase the counter metric
		requests.inc();
		// Start the histogram timer
		Histogram.Timer requestTimer = requestLatency.startTimer();
		try {
			return "Hello World!";
		} finally {
			// Stop the histogram timer
			requestTimer.observeDuration();
		}
	}

}
