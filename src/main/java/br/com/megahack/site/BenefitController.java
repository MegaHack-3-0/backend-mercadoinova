package br.com.megahack.site;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.megahack.entity.Benefit;

@RestController
public class BenefitController {

	static List<Benefit> benefits = new ArrayList<>();
	{
		benefits.add(new Benefit("Frete gratis"));
		benefits.add(new Benefit("10 % desconto"));
	}

	@RequestMapping(value = "/benefits", method = RequestMethod.GET)
	public List<Benefit> show() {
		return benefits;
	}

	@RequestMapping(value = "/benefits", method = RequestMethod.POST)
	public String create(@RequestBody Benefit benefit) {
		benefits.add(benefit);
		return "Sucess";
	}

}
