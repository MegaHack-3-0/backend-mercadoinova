package br.com.megahack.site;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.megahack.entity.User;

@RestController
public class HomeController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public User index() {
		System.out.println("ENVIANDO USUARIO");
		return new User("Ane", 100, 5, 3000);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String read(@RequestBody User user) {
		System.out.println("CHEGOU SAMERDA:" + user.getExperience());
		return user.toString();
	}
}
