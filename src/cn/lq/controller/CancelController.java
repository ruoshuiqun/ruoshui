package cn.lq.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class CancelController  extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest rep, HttpServletResponse resp) throws Exception {
		return new ModelAndView("cancel");
	}

}
