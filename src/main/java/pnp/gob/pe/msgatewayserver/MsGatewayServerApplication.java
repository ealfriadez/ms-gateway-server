package pnp.gob.pe.msgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsGatewayServerApplication.class, args);
    }

}
