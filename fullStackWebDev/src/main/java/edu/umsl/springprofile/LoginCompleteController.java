package edu.umsl.springprofile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginCompleteController {

	@RequestMapping(value="/logincomplete", method=RequestMethod.POST)
	public ModelAndView viewLoginComplete(@RequestParam("name") String name, @RequestParam("password") String password){
		boolean correctLogin = false;
		ModelAndView mav = new ModelAndView("logincompletepage");
		
		UserManager man = new UserManager();
		correctLogin = man.checkLogin(name, password);
		if(correctLogin){
			mav.addObject("status", "This user exists.");
		} else {
			mav.addObject("status", "This user does not exist.");
		}
		
		return mav;
		
	}
	
}
