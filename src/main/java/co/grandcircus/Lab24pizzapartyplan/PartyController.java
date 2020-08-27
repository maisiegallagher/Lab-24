package co.grandcircus.Lab24pizzapartyplan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PartyController {

	@Autowired
	private PartyDao partyDao;

	@Autowired
	private PartyOptionDao partyOptionDao;
	
	@Autowired
	private RsvpDao rsvpDao;

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
		List<PartyOption> pizzaOption = partyOptionDao.findAll();
		model.addAttribute("leListOfOptions", pizzaOption);

		return "votes";

	}

	@RequestMapping("/addMoreVotes")
	public String addMoreVote(Model model, @RequestParam("id") Long id) {
		PartyOption pizza = partyOptionDao.findById(id).get();
		pizza.setVotes(pizza.getVotes() + 1);
		partyOptionDao.save(pizza);

		return "redirect:/partyoption";
	}

	@PostMapping("/addNewPizza")
	public String addPizzaOption(PartyOption pizza, Model model) {
		partyOptionDao.save(pizza);
		model.addAttribute("pizza", pizza);
		return "redirect:/partyoption";
	}
	
	@RequestMapping("/review")
	public String showReviewPage(Model model) {
		List<PartyOption> pizza = partyOptionDao.findAll(Sort.by(Direction.DESC, "votes"));
		model.addAttribute("pizza", pizza);
		return "review";
	}
	@RequestMapping("/{id}")
	public String showRSVP(Model model,@PathVariable("id") Party party)
	{
		model.addAttribute("party",party);
		return "rsvp";
	}
	
	@RequestMapping("/save-rsvp")
	public String submitRSVP(Rsvp rsvp) {
		  rsvpDao.save(rsvp);
		  return "redirect:/party";
	}
	
	
}
