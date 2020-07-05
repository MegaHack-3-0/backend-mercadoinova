package br.com.megahack.site;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.megahack.entity.Cupom;

@RestController
public class CupomController {

	static List<Cupom> cupons = new ArrayList<>();

	{
		cupons.add(new Cupom("10% de desconto na compra de um Smart Watches", new BigDecimal(1000)));
		cupons.add(
				new Cupom("20% de desconto na compra de um Smartphone Samsung Galaxy S10 Plus", new BigDecimal(3000)));

	}

	@RequestMapping(value = "/cupons", method = RequestMethod.GET)
	public List<Cupom> show() {
		return cupons;
	}

	@RequestMapping(value = "/cupons", method = RequestMethod.POST)
	public String create(@RequestBody Cupom cupon) {
		cupons.add(cupon);
		return "Sucess";
	}

}
