package com.javalec.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//web.xml 미사용 -> 리스너 클래스 제작으로 리스너 호출
@WebListener
public class ServletCL implements ServletContextListener {

	//웹어플리케이션 종료시 구동
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("contextDestroyed");

	}
	
	//웹어플리케이션 실행시 구동
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("contextInitialized");

	}

}
