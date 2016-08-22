package ihundan.wukonglin.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowController {
	
	@RequestMapping(value="/wukonglin",method = RequestMethod.GET)
	public ModelAndView wukonglin() {
		return new ModelAndView("hello");
	}
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String hellow() {
		return "hello";
	}
	
	@ResponseBody
	@RequestMapping(value="/ihundan",method = RequestMethod.GET)
	public String ihundan() {
		return "ihundan hellow world !!!";
	}
}
