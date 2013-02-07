package com.paradise.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.paradise.app.domain.User;
import com.paradise.app.services.UserService;

@Component(value = "userLoginBean")
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserLoginBean {

	private User loggedUser;

	@Autowired
	private UserService userService;

	public User getLoggedUser() {
		if (loggedUser == null) {
			String userName = SecurityContextHolder.getContext()
					.getAuthentication().getName();

			if (userName != null) {
				loggedUser = userService.findByUsername(userName);
			}
		}

		return loggedUser;
	}
}