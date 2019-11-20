package co.gc.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeHomeController {
	
	@Autowired
	PersonDetailsDAO dao;

//	@RequestMapping("/")
//	public ModelAndView home() {
//
//		ModelAndView mv = new ModelAndView("index");
//		return mv;
//	}

	@RequestMapping("register")
	public ModelAndView registerForm() {

		ModelAndView mv = new ModelAndView("register-form");
		return mv;

	}

	@PostMapping("register-user")
	public ModelAndView confirmationForm(FormPerson p) {
		// FormPerson p = new FormPerson()
		return new ModelAndView("confirmation-form", "personInfo", p);
	}
	
	@RequestMapping("register-user")
	public String addUser(FormPerson fp) {
		dao.addPerson(fp.getFirstName(), fp.getLastName(), fp.getEmail(), fp.getPhoneNumber(), fp.getAddress());
		return ("register-form");
		
	}

//	@RequestMapping("rapping")
//	public String rapform() {
//		return "lyrics";
//	}
//
//	@RequestMapping("done")
//	public ModelAndView getSong(@RequestParam("noun1") String n1, @RequestParam("noun2") String n2,
//			@RequestParam("noun3") String n3, @RequestParam("noun4") String n4, @RequestParam("noun5") String n5,
//			@RequestParam("verb1") String v1, @RequestParam("verb2") String v2, @RequestParam("adjective") String a) {
//		ModelAndView mv = new ModelAndView("the-rap");
//		String line1 = "Just waking up in the " + n1 + "gotta thank " + n2;
//		String line2 = "I dont know, but today seems kind of " + a;
//		String line3 = "No " + v1 + "ing from the " + n3 + ", no smog, momma cooked a breakfast with no " + n4;
//		String line4 = "I got my " + v2 + " on, but I didn't " + n5 + " out.";
//		mv.addObject("verse1", line1);
//		mv.addObject("verse2", line2);
//		mv.addObject("verse3", line3);
//		mv.addObject("verse4", line4);
//		
//		return mv;
//
//	}

}
