package cn.lq.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import cn.lq.chapter4.model.UserModel;

@SuppressWarnings("deprecation")
public class CanCancelRegisterSimpleFormController extends CancellableFormController {

	public CanCancelRegisterSimpleFormController(){
		//设置命令对象实现类
		setCommandClass(UserModel.class);
		//设置命令对象的名字
		setCommandName("user");
	}
	
	//提供展示表单时需要的一些其他数据
		@Override
		protected Map referenceData(HttpServletRequest request) throws Exception {
			Map map = new HashMap();
			map.put("cityList", Arrays.asList("山东", "北京", "上海"));
			return map;
		}


		@Override
		protected void doSubmitAction(Object command) throws Exception {
			UserModel user = (UserModel) command;
			//TODO 调用业务对象处理
			System.out.println(user);
		}
		
		@Override
		protected ModelAndView onCancel(Object command) throws Exception {
			UserModel user = (UserModel) command;
			//TODO 调用业务对象处理
			System.out.println(user);
			return super.onCancel(command);
		}
}
