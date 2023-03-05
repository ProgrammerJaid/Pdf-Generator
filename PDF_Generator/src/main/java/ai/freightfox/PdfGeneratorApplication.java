package ai.freightfox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ai.freightfox.entity.Buyer;
import ai.freightfox.entity.Seller;

@SpringBootApplication
public class PdfGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfGeneratorApplication.class, args);
	}
	
	@Bean
	Buyer getBuyer() {
		return new Buyer();
	}
	
	@Bean
	Seller getSeller() {
		return new Seller();
	}
}
