package com.fastmart.vendorAppBackend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageRestController {

	@GetMapping("/")
	public String showHomePage() {
		String home = "<h1> Fastmart Vendor's App Web Services</h1>" + " <h2> Welcome </h2>";

		return home;
	}

}
