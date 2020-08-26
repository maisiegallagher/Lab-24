package co.grandcircus.Lab24pizzapartyplan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PartyController {
	
	@Autowired
	private PartyDao partyDao;
	
	@Autowired
	private PartyOptionDao partyOptionDao;
	
	@RequestMapping("/") 
		public String homepage() {
			return "redirect:/party";
		}

		@RequestMapping("/party")
		public String listParty(Model model) {

			List<Party> party = partyDao.findAll();
			
			model.addAttribute("leListOfParties", party);

			return "homepage";
		}

		@RequestMapping("/partyoption")
		public String listPizzaOptions(Model model) {
			List<PartyOption> pizzaOption=partyOptionDao.findAll();
			model.addAttribute("pizzaOption",pizzaOption);
			
			return "votes";
		
		}
}
