package lalkala.mfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class ApplicationRun {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationRun.class, args);
		
	}
}
