package co.grandcircus.Lab24pizzapartyplan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PizzaController {
	
	
	@RequestMapping("/") 
		public String homepage() {
			return "homepage";
		}
	

}
