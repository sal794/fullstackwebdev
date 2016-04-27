package edu.umsl.springprofile;

import javax.servlet.http.HttpServletRequest;

import org.opensaml.ws.transport.http.HttpServletRequestAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewReport {

	@RequestMapping(value="/viewreport", method=RequestMethod.POST)
	public ModelAndView viewReport(@RequestParam("name") String name, @RequestParam("password") String password) {

		ModelAndView mav = new ModelAndView("myreportpage.html");
		
		System.out.println(name);
		System.out.println(password);
		
		
		return mav;
	}

}
