package net.focik.addresses;

//import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class AddressesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressesApplication.class, args);
	}

}
