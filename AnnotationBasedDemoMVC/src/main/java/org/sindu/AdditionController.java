package org.sindu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {

@RequestMapping("/add")
public ModelAndView add( @RequestParam("t1") int num1,@RequestParam("t2") int num2) {
	
	AddService service = new AddService();
	//int num1 =Integer.parseInt(req.getParameter("t1"));
	//int num2 =Integer.parseInt(req.getParameter("t2"));
	int result = service.add(num1, num2);
	ModelAndView mv = new ModelAndView();
	mv.setViewName("display"); //specify InternalResourceViewResolver for setting prefix / and suffix .jsp file in config file
	mv.addObject("num1",num1);
	mv.addObject("num2",num2);
	mv.addObject("result",result);
	return mv;
}
}
