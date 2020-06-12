package br.smc.cloudconfigclienttest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudConfigClientTestApplication {

	@Value("${backend.url}")
	private String backendUrl;

	@Value("${backend.user}")
	private String user;

	@Value("${backend.password}")
	private String password;

	@Value("${frontend.url}")
	private String frontendUrl;

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClientTestApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "backendUrl:  " + backendUrl
				+ " user: " + user
				+ " password: " + password
				+ " frontUrl: " + frontendUrl;
	}
}
