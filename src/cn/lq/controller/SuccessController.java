package cn.lq.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class SuccessController  extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req , HttpServletResponse resp) throws Exception {
		return new ModelAndView("success");
	}

}
