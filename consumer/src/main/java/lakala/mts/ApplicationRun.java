package lakala.mts;

import lakala.api.PayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class ApplicationRun {
	
	
	@Autowired
	private PayService pay;
	
	
	@RequestMapping("/pay")
	public void pay(){
		 pay.pay();
	}
	@RequestMapping("/payMoney")
	public String payMoney(int num){
		return pay.payMoney(num);
	}
	public static void main(String[] args) {
		SpringApplication.run(ApplicationRun.class, args);
	}
}
