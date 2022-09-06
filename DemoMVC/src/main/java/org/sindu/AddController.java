package org.sindu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("add")
	public String add() {
		return"display.jsp";
	}
	
	@RequestMapping("display")
	public ModelAndView display(HttpServletRequest req,HttpServletResponse res) {
		String name = req.getParameter("t1").toString();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",name);
		return mv;
	}
}
