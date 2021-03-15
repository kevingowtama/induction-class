package id.co.bankmandiri.apigatewaylatihan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayLatihanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayLatihanApplication.class, args);
	}

}
