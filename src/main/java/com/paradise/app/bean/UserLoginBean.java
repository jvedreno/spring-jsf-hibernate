package com.paradise.app.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paradise.app.domain.User;
import com.paradise.app.services.UserService;

@ManagedBean(name = "userLoginBean")
@SessionScoped
public class UserLoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private User loggedUser;
	private Boolean show = true; 
	private String text;

//	@Autowired
//	private UserService userService;

	public User getLoggedUser() {
//		if (loggedUser == null) {
//			String userName = SecurityContextHolder.getContext()
//					.getAuthentication().getName();
//
//			if (userName != null) {
//				loggedUser = userService.findByUsername(userName);
//			}
//		}

		return loggedUser;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
		text = "a";
		
	}
	
	@RequestMapping("/change")
	public void changeShow() {
		show = !show;
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}