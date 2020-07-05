package br.com.megahack.site;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.megahack.entity.Product;
import br.com.megahack.vo.ProductVO;

@RestController
public class ProductController {

	static SimpleDateFormat formaDate = new SimpleDateFormat("dd/MM/yyyy");
	static List<Product> products = new ArrayList<>();
	{
		try {
			products.add(new Product(
					new ProductVO("Smartphone", "Apple", "Iphone 8", "10/10/2018", new BigDecimal(10000), 365, 365)));
			products.add(new Product(
					new ProductVO("Laptop", "Dell", "Vostro 3550", "10/10/2019", new BigDecimal(2000), 365, 365)));
		} catch (ParseException e) {
			// ignore
		}
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> show() {
		List<ProductVO> vos = new ArrayList<ProductVO>();
		products.forEach(product -> vos.add(new ProductVO(product)));
		return products;
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public String create(@RequestBody ProductVO productVO) throws ParseException {
		products.add(new Product(productVO));
		return "Sucess";
	}

}
