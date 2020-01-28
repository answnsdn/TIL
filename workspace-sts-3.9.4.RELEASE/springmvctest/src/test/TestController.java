package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest res, HttpServletResponse req) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		//공유데이터 저장
		mav.addObject("gugu","9*1=9");
		
		//forward할 뷰의 정보를 정의 - 기본이 forward
		mav.setViewName("/WEB-INF/result.jsp");
		return mav;
	}

}
