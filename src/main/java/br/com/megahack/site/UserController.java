package br.com.megahack.site;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.megahack.entity.User;

@RestController
public class UserController {

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public User show() {
		return new User("Ane Mendes", 1500, 5, 100);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User create(@RequestBody User user) {
		return user;
	}

}
